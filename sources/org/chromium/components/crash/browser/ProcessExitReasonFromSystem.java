package org.chromium.components.crash.browser;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.os.Build;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.EI2;
import defpackage.V60;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ProcessExitReasonFromSystem {
    public static int a(int i) {
        List historicalProcessExitReasons;
        int pid;
        int reason;
        if (Build.VERSION.SDK_INT < 30) {
            return -1;
        }
        historicalProcessExitReasons = ((ActivityManager) V60.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, i, 1);
        if (!historicalProcessExitReasons.isEmpty() && historicalProcessExitReasons.get(0) != null) {
            pid = ((ApplicationExitInfo) historicalProcessExitReasons.get(0)).getPid();
            if (pid == i) {
                reason = ((ApplicationExitInfo) historicalProcessExitReasons.get(0)).getReason();
                return reason;
            }
        }
        return -1;
    }

    public static void b(int i, String str) {
        int i2;
        switch (i) {
            case 0:
                i2 = 11;
                break;
            case 1:
                i2 = 5;
                break;
            case 2:
                i2 = 10;
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                i2 = 7;
                break;
            case 4:
                i2 = 1;
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                i2 = 2;
                break;
            case 6:
                i2 = 0;
                break;
            case 7:
                i2 = 6;
                break;
            case 8:
                i2 = 9;
                break;
            case 9:
                i2 = 4;
                break;
            case 10:
                i2 = 12;
                break;
            case 11:
                i2 = 13;
                break;
            case 12:
                i2 = 3;
                break;
            case 13:
                i2 = 8;
                break;
            default:
                return;
        }
        EI2.h(i2, 14, str);
    }

    public static void recordExitReasonToUma(int i, String str) {
        b(a(i), str);
    }
}
