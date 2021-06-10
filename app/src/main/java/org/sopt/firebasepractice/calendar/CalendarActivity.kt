package org.sopt.firebasepractice.calendar

import android.os.Bundle
import androidx.activity.viewModels
import org.sopt.firebasepractice.R
import org.sopt.firebasepractice.base.BaseActivity
import org.sopt.firebasepractice.base.BaseViewModel
import org.sopt.firebasepractice.databinding.ActivityCalendarBinding

class CalendarActivity : BaseActivity<ActivityCalendarBinding, BaseViewModel>() {
    override val layoutResourceId: Int
        get() = R.layout.activity_calendar
    override val viewModel: BaseViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)
        showCalendarFragment()
    }

    fun showCalendarFragment(){
        val calendarFragment = CalendarFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.calendar_fragment, calendarFragment)
        transaction.commit()
    }

    override fun initStartView() {
        TODO("Not yet implemented")
    }

    override fun initDataBinding() {
        TODO("Not yet implemented")
    }

    override fun initAfterBinding() {
        TODO("Not yet implemented")
    }
}