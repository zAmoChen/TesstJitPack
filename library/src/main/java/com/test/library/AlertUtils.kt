package com.test.library

import android.content.Context
import androidx.appcompat.app.AlertDialog

/**
 * Description: TODO
 * Created by: 2021/10/14 12:21 下午
 * Author: chendan
 */
object AlertUtils {

    fun show(context: Context) {
        AlertDialog.Builder(context).setMessage("TEST JITPACK").show()
    }
}