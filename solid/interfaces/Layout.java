package com.n3.solid.interfaces;

import com.n3.solid.enums.ReportLevel;

public interface Layout {

    String format(String time, String message, ReportLevel reportLevel);
}
