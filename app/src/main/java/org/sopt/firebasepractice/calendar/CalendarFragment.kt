package org.sopt.firebasepractice.calendar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView
import android.widget.CalendarView.*
import androidx.fragment.app.activityViewModels
import org.sopt.firebasepractice.R
import org.sopt.firebasepractice.base.BaseFragment
import org.sopt.firebasepractice.base.BaseViewModel
import org.sopt.firebasepractice.databinding.FragmentCalendarBinding
import java.text.DateFormat
import java.util.*

class CalendarFragment : Fragment() {

    lateinit var binding : FragmentCalendarBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setCalendarView()
    }

    fun setCalendarView(){
        val calendar = Calendar.getInstance()
        binding.calendarMain.setOnDateChangeListener(object : OnDateChangeListener{
            override fun onSelectedDayChange(p0: CalendarView, p1: Int, p2: Int, p3: Int) {
               calendar.set(p1,p2,p3)
                val dateFormatter =DateFormat.getDateInstance(DateFormat.MEDIUM)
                val formattedDate = dateFormatter.format(calendar.time)
                binding.textviewShowDate.text= formattedDate
            }

        })
    }
    override fun onDestroyView() {
        super.onDestroyView()
    }

}