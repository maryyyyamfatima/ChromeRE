package com.google.common.flogger.backend.android;

import android.os.Build;
import dalvik.system.VMStack;
import defpackage.AbstractC0659Fb3;
import defpackage.AbstractC10332uE2;
import defpackage.AbstractC2182Qu2;
import defpackage.AbstractC2312Ru2;
import defpackage.AbstractC6232iI1;
import defpackage.C11018wE2;
import defpackage.CE2;
import defpackage.V8;
import defpackage.Z50;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class c extends AbstractC2312Ru2 {
    private static final boolean e = b.a();
    private static final boolean f;
    private static final AbstractC2182Qu2 g;

    @Override // defpackage.AbstractC2312Ru2
    public String g() {
        return "platform: Android";
    }

    static {
        String str = Build.FINGERPRINT;
        f = str == null || "robolectric".equals(str);
        g = new a();
    }

    public static boolean s() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new Class[0]);
            return b.class.getName().equals(t());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // defpackage.AbstractC2312Ru2
    public Z50 i() {
        return CE2.b;
    }

    public static String t() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // defpackage.AbstractC2312Ru2
    public AbstractC6232iI1 c(String str) {
        AtomicReference atomicReference = C11018wE2.c;
        if (atomicReference.get() != null) {
            return ((AbstractC0659Fb3) ((V8) atomicReference.get())).a(str);
        }
        C11018wE2 c11018wE2 = new C11018wE2(str.replace('$', '.'));
        AbstractC10332uE2.a.offer(c11018wE2);
        if (atomicReference.get() != null) {
            while (true) {
                C11018wE2 c11018wE22 = (C11018wE2) AbstractC10332uE2.a.poll();
                if (c11018wE22 == null) {
                    break;
                }
                c11018wE22.b = ((AbstractC0659Fb3) ((V8) C11018wE2.c.get())).a(c11018wE22.a());
            }
            C11018wE2.e();
        }
        return c11018wE2;
    }

    public static Class r() {
        return VMStack.getStackClass2();
    }

    @Override // defpackage.AbstractC2312Ru2
    public AbstractC2182Qu2 e() {
        return g;
    }
}
