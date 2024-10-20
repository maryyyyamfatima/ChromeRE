package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.SysUtils;
import org.chromium.chrome.browser.app.bluetooth.BluetoothNotificationService;
import org.chromium.chrome.browser.app.usb.UsbNotificationService;
import org.chromium.chrome.browser.media.MediaCaptureNotificationService;
import org.chromium.content.browser.ChildProcessLauncherHelperImpl;
import org.chromium.content.browser.LauncherThread;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KB2 implements Runnable {
    public final /* synthetic */ RB2 a;

    @Override // java.lang.Runnable
    public final void run() {
        Set k;
        Q83 q83 = O83.a;
        Set k2 = q83.k("WebRTCNotificationIds", null);
        if (k2 != null && !k2.isEmpty()) {
            Context context = V60.a;
            context.startService(new Intent(context, (Class<?>) MediaCaptureNotificationService.class));
        }
        if (N.Mudil8Bg("WebBluetoothNewPermissionsBackend") && (k = q83.k("Chrome.Bluetooth.NotificationIds", null)) != null && !k.isEmpty()) {
            Context context2 = V60.a;
            context2.startService(new Intent(context2, (Class<?>) BluetoothNotificationService.class));
        }
        Set k3 = q83.k("Chrome.USB.NotificationIds", null);
        if (k3 != null && !k3.isEmpty()) {
            Context context3 = V60.a;
            context3.startService(new Intent(context3, (Class<?>) UsbNotificationService.class));
        }
        RB2 rb2 = this.a;
        rb2.getClass();
        if (!SysUtils.isLowEndDevice()) {
            Context context4 = V60.a;
            boolean z = ChildProcessLauncherHelperImpl.m;
            LauncherThread.a(new RunnableC9330rK(context4));
            ChildProcessLauncherHelperImpl.v = ApplicationStatus.getStateForApplication() == 1 || ApplicationStatus.getStateForApplication() == 2;
            ApplicationStatus.d(new InterfaceC11522xj() { // from class: mK
                @Override // defpackage.InterfaceC11522xj
                public final void n(int i) {
                    boolean z2 = ChildProcessLauncherHelperImpl.m;
                    if (i != 0) {
                        if (i == 1 || i == 2) {
                            if (ChildProcessLauncherHelperImpl.v) {
                                return;
                            }
                            ChildProcessLauncherHelperImpl.v = true;
                            LauncherThread.a(new Runnable() { // from class: nK
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ComponentCallbacks2C2974Wx componentCallbacks2C2974Wx = ChildProcessLauncherHelperImpl.u;
                                    if (componentCallbacks2C2974Wx != null) {
                                        LauncherThread.b.removeCallbacks(componentCallbacks2C2974Wx.h);
                                    }
                                }
                            });
                            return;
                        }
                        if (ChildProcessLauncherHelperImpl.v) {
                            ChildProcessLauncherHelperImpl.v = false;
                            LauncherThread.a(new Runnable() { // from class: oK
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ComponentCallbacks2C2974Wx componentCallbacks2C2974Wx = ChildProcessLauncherHelperImpl.u;
                                    if (componentCallbacks2C2974Wx == null || componentCallbacks2C2974Wx.a.isEmpty()) {
                                        return;
                                    }
                                    LauncherThread.b.postDelayed(componentCallbacks2C2974Wx.h, 10000L);
                                }
                            });
                        }
                    }
                }
            });
        }
        rb2.getClass();
        InputMethodManager inputMethodManager = (InputMethodManager) V60.a.getSystemService("input_method");
        List<InputMethodInfo> enabledInputMethodList = inputMethodManager.getEnabledInputMethodList();
        ArrayList arrayList = new ArrayList();
        Iterator<InputMethodInfo> it = enabledInputMethodList.iterator();
        while (it.hasNext()) {
            for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                if (inputMethodSubtype.getMode().equals("keyboard")) {
                    String str = inputMethodSubtype.getLocale().split("_")[0];
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        EI2.e(arrayList.size(), "InputMethod.ActiveCount");
        InputMethodSubtype currentInputMethodSubtype = inputMethodManager.getCurrentInputMethodSubtype();
        Locale locale = Locale.getDefault();
        if (currentInputMethodSubtype == null || currentInputMethodSubtype.getLocale() == null || locale == null) {
            return;
        }
        EI2.b("InputMethod.MatchesSystemLanguage", locale.getLanguage().equalsIgnoreCase(currentInputMethodSubtype.getLocale().split("_")[0]));
    }

    public KB2(RB2 rb2) {
        this.a = rb2;
    }
}
