package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.h;
import defpackage.BA1;
import defpackage.C10547us;
import defpackage.C1379Kp3;
import defpackage.DA1;
import defpackage.FA1;
import defpackage.VS0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LifecycleCallback {
    public final DA1 a;

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void d(int i, int i2, Intent intent) {
    }

    public void e(Bundle bundle) {
    }

    public void f() {
    }

    public void g(Bundle bundle) {
    }

    public void h() {
    }

    public void i() {
    }

    private static DA1 getChimeraLifecycleFragmentImpl(BA1 ba1) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static DA1 c(BA1 ba1) {
        FA1 fa1;
        C1379Kp3 c1379Kp3;
        Activity activity = ba1.a;
        if (!(activity instanceof VS0)) {
            if (!(activity instanceof Activity)) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = FA1.i;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference == null || (fa1 = (FA1) weakReference.get()) == null) {
                try {
                    fa1 = (FA1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (fa1 == null || fa1.isRemoving()) {
                        fa1 = new FA1();
                        activity.getFragmentManager().beginTransaction().add(fa1, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap.put(activity, new WeakReference(fa1));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
                }
            }
            return fa1;
        }
        VS0 vs0 = (VS0) activity;
        WeakHashMap weakHashMap2 = C1379Kp3.e0;
        WeakReference weakReference2 = (WeakReference) weakHashMap2.get(vs0);
        if (weakReference2 == null || (c1379Kp3 = (C1379Kp3) weakReference2.get()) == null) {
            try {
                c1379Kp3 = (C1379Kp3) vs0.h0().B("SupportLifecycleFragmentImpl");
                if (c1379Kp3 == null || c1379Kp3.r) {
                    c1379Kp3 = new C1379Kp3();
                    h h0 = vs0.h0();
                    h0.getClass();
                    C10547us c10547us = new C10547us(h0);
                    c10547us.g(0, c1379Kp3, "SupportLifecycleFragmentImpl", 1);
                    c10547us.e(true);
                }
                weakHashMap2.put(vs0, new WeakReference(c1379Kp3));
            } catch (ClassCastException e2) {
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
            }
        }
        return c1379Kp3;
    }

    public LifecycleCallback(DA1 da1) {
        this.a = da1;
    }

    public final Activity b() {
        return this.a.j();
    }
}
