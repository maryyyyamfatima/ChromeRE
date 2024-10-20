package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.Display;
import com.android.chrome.R;
import java.io.DataInputStream;
import java.util.Iterator;
import org.chromium.base.ApplicationStatus;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.display.DisplayAndroidManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LZ1 implements InterfaceC3657ao2, GI2, T20, V02, InterfaceC7163l02, InterfaceC0186Bl0, InterfaceC9035qT1 {
    public static int s;
    public static Class t;
    public Boolean a;
    public KZ1 g;
    public final Activity h;
    public final InterfaceC7697ma2 i;
    public final C7507m02 j;
    public final I5 k;
    public final InterfaceC9377rT1 l;
    public int m;
    public boolean n;
    public JZ1 o;
    public boolean p;
    public boolean q;
    public int r;

    public int h(int i, int i2, boolean z) {
        return 0;
    }

    public void k(int i, int i2) {
    }

    @Override // defpackage.InterfaceC0186Bl0
    public void onDestroy() {
        JZ1 jz1;
        this.j.b.d(this);
        ((ChromeActivity) this.l).L0.remove(this);
        DisplayManager displayManager = (DisplayManager) this.h.getSystemService("display");
        if (displayManager == null || (jz1 = this.o) == null) {
            return;
        }
        displayManager.unregisterDisplayListener(jz1);
    }

    public LZ1(Activity activity, C8385oa2 c8385oa2, C7507m02 c7507m02, I5 i5, InterfaceC9377rT1 interfaceC9377rT1) {
        this.h = activity;
        this.i = c8385oa2;
        this.j = c7507m02;
        c7507m02.b.a(this);
        this.k = i5;
        i5.b(this);
        this.l = interfaceC9377rT1;
        ((ChromeActivity) interfaceC9377rT1).L0.add(this);
    }

    @Override // defpackage.V02
    public final void U() {
        this.n = true;
        Activity activity = this.h;
        DisplayManager displayManager = (DisplayManager) activity.getSystemService("display");
        if (displayManager == null) {
            return;
        }
        this.r = DisplayAndroidManager.a(activity).getDisplayId();
        JZ1 jz1 = new JZ1(this);
        this.o = jz1;
        displayManager.registerDisplayListener(jz1, null);
    }

    public static boolean d(LZ1 lz1, int i) {
        Display display;
        if (i == 0) {
            lz1.getClass();
        } else {
            DisplayManager displayManager = (DisplayManager) lz1.h.getSystemService("display");
            if (displayManager != null) {
                Display[] displays = displayManager.getDisplays();
                int length = displays.length;
                for (int i2 = 0; i2 < length; i2++) {
                    display = displays[i2];
                    if (display.getDisplayId() == i) {
                        break;
                    }
                }
            }
            display = null;
            if (display == null || (display.getFlags() & 8) == 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC3657ao2
    public void c() {
        boolean z;
        Boolean bool;
        if (l()) {
            C7507m02 c7507m02 = this.j;
            c7507m02.getClass();
            C7851n02 c7851n02 = C7851n02.i;
            c7851n02.getClass();
            if (!C7851n02.p(c7507m02.a)) {
                c7851n02.getClass();
                if (!C7851n02.n(c7507m02.a)) {
                    z = false;
                    if (z && (bool = this.a) != null && bool.booleanValue()) {
                        n();
                    } else if (!z && this.a == null) {
                        m();
                    }
                    this.a = Boolean.FALSE;
                }
            }
            z = true;
            if (z) {
            }
            if (!z) {
                m();
            }
            this.a = Boolean.FALSE;
        }
    }

    @Override // defpackage.InterfaceC7163l02
    public final void b(boolean z) {
        if (l() && this.n && !z) {
            if (this.k.l == 3) {
                ChromeTabbedActivity j = j();
                if (j == null) {
                    n();
                    return;
                }
                KZ1 kz1 = new KZ1(this);
                this.g = kz1;
                ApplicationStatus.e(kz1, j);
                return;
            }
            this.a = Boolean.TRUE;
        }
    }

    @Override // defpackage.T20
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.p) {
            if (this.q) {
                t = this.h.getClass();
            } else {
                t = null;
                n();
            }
            this.p = false;
        }
    }

    @Override // defpackage.InterfaceC9035qT1
    public boolean a(int i, boolean z) {
        AbstractC11276wz3 abstractC11276wz3;
        Tab h;
        if (i != R.id.move_to_other_window_menu_id) {
            if (i != R.id.new_window_menu_id) {
                return false;
            }
            q("MobileMenuNewWindow");
            return true;
        }
        AbstractC9561rz3 abstractC9561rz3 = (AbstractC9561rz3) ((C8385oa2) this.i).g;
        if (abstractC9561rz3 != null && (abstractC11276wz3 = abstractC9561rz3.b) != null && (h = abstractC11276wz3.h()) != null) {
            p(h);
        }
        return true;
    }

    public final ChromeTabbedActivity j() {
        C7507m02 c7507m02 = this.j;
        c7507m02.getClass();
        Class h = C7851n02.i.h(c7507m02.a);
        Iterator it = ApplicationStatus.b().iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) it.next();
            if (activity.getClass().equals(h) && ApplicationStatus.c(activity) == 3) {
                return (ChromeTabbedActivity) activity;
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void e() {
        KZ1 kz1 = this.g;
        if (kz1 != null) {
            ApplicationStatus.h(kz1);
            this.g = null;
        }
    }

    public final void m() {
        if (l()) {
            C7507m02 c7507m02 = this.j;
            c7507m02.getClass();
            Class h = C7851n02.i.h(c7507m02.a);
            ActivityManager.AppTask appTask = null;
            for (ActivityManager.AppTask appTask2 : ((ActivityManager) this.h.getSystemService("activity")).getAppTasks()) {
                if (C7851n02.d(appTask2).equals(h.getName())) {
                    appTask = appTask2;
                }
            }
            if (appTask != null) {
                Iterator it = ApplicationStatus.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Activity activity = (Activity) it.next();
                    if (activity.getClass().equals(h)) {
                        ((ChromeTabbedActivity) activity).g2();
                        break;
                    }
                }
                appTask.finishAndRemoveTask();
            }
            s = this.m;
        }
    }

    public final void n() {
        if (l()) {
            m();
            FI2.a("Android.MergeState.Live");
            C9284rA3 c9284rA3 = ((AbstractC9561rz3) ((C8385oa2) this.i).g).a;
            if (!c9284rA3.w) {
                InterfaceC2728Uz3 interfaceC2728Uz3 = c9284rA3.b;
                if (!interfaceC2728Uz3.f() && c9284rA3.h.isEmpty()) {
                    AbstractC4851eH1.d("tabmodel", "Merging state", new Object[0]);
                    c9284rA3.n = false;
                    c9284rA3.o = false;
                    c9284rA3.p = new SparseIntArray();
                    c9284rA3.q = new SparseIntArray();
                    try {
                        for (String str : interfaceC2728Uz3.j()) {
                            N33 n33 = c9284rA3.r;
                            C3118Xz3 c3118Xz3 = new C3118Xz3(c9284rA3, str);
                            c3118Xz3.d(n33);
                            DataInputStream dataInputStream = (DataInputStream) c3118Xz3.f();
                            if (dataInputStream != null) {
                                c9284rA3.u.add(str);
                                interfaceC2728Uz3.c(true);
                                C9284rA3.m(dataInputStream, new C4818eA3(c9284rA3, true, ((AbstractC11276wz3) c9284rA3.c).o()), null);
                            }
                        }
                    } catch (Exception e) {
                        e.toString();
                    }
                    c9284rA3.k();
                    return;
                }
            }
            AbstractC4851eH1.d("tabmodel", "Tab load still in progress when merge was attempted.", new Object[0]);
        }
    }

    public void p(Tab tab) {
        Intent intent;
        C7507m02 c7507m02 = this.j;
        c7507m02.getClass();
        C7851n02 c7851n02 = C7851n02.i;
        Activity activity = c7507m02.a;
        Class h = c7851n02.h(activity);
        if (h == null) {
            intent = null;
        } else {
            intent = new Intent(activity, (Class<?>) h);
            C7851n02.v(intent, activity, h);
        }
        if (intent == null) {
            return;
        }
        s = 0;
        C10720vN2 a = C10720vN2.a(tab);
        Bundle i = C7851n02.i(c7507m02.a);
        a.b(intent, null);
        this.h.startActivity(intent, i);
        FI2.a("MobileMenuMoveToOtherWindow");
    }

    public void q(String str) {
        Intent intent;
        C7507m02 c7507m02 = this.j;
        c7507m02.getClass();
        C7851n02 c7851n02 = C7851n02.i;
        Activity activity = c7507m02.a;
        Class h = c7851n02.h(activity);
        if (h == null) {
            intent = null;
        } else {
            Intent intent2 = new Intent(activity, (Class<?>) h);
            C7851n02.v(intent2, activity, h);
            intent = intent2;
        }
        if (intent == null) {
            return;
        }
        intent.addFlags(268435456);
        intent.addFlags(4096);
        s = 0;
        this.h.startActivity(intent, C7851n02.i(c7507m02.a));
        FI2.a("MobileMenuNewWindow");
    }

    public boolean l() {
        return !AX.e().g("disable-tab-merging") && Build.VERSION.SDK_INT > 23;
    }
}
