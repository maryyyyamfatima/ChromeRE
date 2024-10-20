package com.google.common.flogger.backend.android;

import dalvik.system.VMStack;
import defpackage.AbstractC2182Qu2;
import defpackage.AbstractC9991tF;
import defpackage.OH1;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
class a extends AbstractC2182Qu2 {
    @Override // defpackage.AbstractC2182Qu2
    public String b(Class cls) {
        boolean z;
        boolean z2;
        StackTraceElement a;
        z = c.e;
        if (z) {
            try {
                if (cls.equals(c.r())) {
                    return VMStack.getStackClass2().getName();
                }
            } catch (Throwable unused) {
            }
        }
        z2 = c.f;
        if (!z2 || (a = AbstractC9991tF.a(cls)) == null) {
            return null;
        }
        return a.getClassName();
    }

    @Override // defpackage.AbstractC2182Qu2
    public OH1 a(Class cls, int i) {
        return OH1.a;
    }
}
