package com.google.android.gms.tasks;

import defpackage.AF3;
import defpackage.InterfaceC1702Nc2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NativeOnCompleteListener implements InterfaceC1702Nc2 {
    public native void nativeOnComplete(long j, Object obj, boolean z, boolean z2, String str);

    @Override // defpackage.InterfaceC1702Nc2
    public final void b(AF3 af3) {
        Object obj;
        String str;
        Exception j;
        if (af3.l()) {
            obj = af3.k();
            str = null;
        } else if (af3.d || (j = af3.j()) == null) {
            obj = null;
            str = null;
        } else {
            str = j.getMessage();
            obj = null;
        }
        nativeOnComplete(0L, obj, af3.l(), af3.d, str);
    }
}
