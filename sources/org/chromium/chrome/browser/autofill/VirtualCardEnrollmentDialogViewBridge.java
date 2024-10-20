package org.chromium.chrome.browser.autofill;

import J.N;
import android.content.Context;
import defpackage.C2424Sr;
import defpackage.InterfaceC2294Rr;
import defpackage.ZX1;
import java.util.Objects;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.autofill.VirtualCardEnrollmentDelegate;
import org.chromium.chrome.browser.autofill.VirtualCardEnrollmentDialogViewBridge;
import org.chromium.chrome.browser.autofill.settings.VirtualCardEnrollmentFields;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class VirtualCardEnrollmentDialogViewBridge {
    public final String a;
    public final String b;
    public final VirtualCardEnrollmentDelegate c;
    public final VirtualCardEnrollmentFields d;
    public final WindowAndroid e;
    public C2424Sr f;

    public VirtualCardEnrollmentDialogViewBridge(String str, String str2, VirtualCardEnrollmentDelegate virtualCardEnrollmentDelegate, VirtualCardEnrollmentFields virtualCardEnrollmentFields, WindowAndroid windowAndroid) {
        this.a = str;
        this.b = str2;
        this.c = virtualCardEnrollmentDelegate;
        this.d = virtualCardEnrollmentFields;
        this.e = windowAndroid;
    }

    public static VirtualCardEnrollmentDialogViewBridge create(String str, String str2, VirtualCardEnrollmentDelegate virtualCardEnrollmentDelegate, VirtualCardEnrollmentFields virtualCardEnrollmentFields, WindowAndroid windowAndroid) {
        if (virtualCardEnrollmentDelegate == null || virtualCardEnrollmentFields == null || windowAndroid == null) {
            return null;
        }
        return new VirtualCardEnrollmentDialogViewBridge(str, str2, virtualCardEnrollmentDelegate, virtualCardEnrollmentFields, windowAndroid);
    }

    public final void showDialog() {
        Callback callback = new Callback() { // from class: hf4
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Integer num = (Integer) obj;
                VirtualCardEnrollmentDialogViewBridge virtualCardEnrollmentDialogViewBridge = VirtualCardEnrollmentDialogViewBridge.this;
                virtualCardEnrollmentDialogViewBridge.getClass();
                int intValue = num.intValue();
                VirtualCardEnrollmentDelegate virtualCardEnrollmentDelegate = virtualCardEnrollmentDialogViewBridge.c;
                if (intValue == 1) {
                    long j = virtualCardEnrollmentDelegate.a;
                    if (j != 0) {
                        N.MPydP90q(j);
                        return;
                    }
                    return;
                }
                if (num.intValue() == 2) {
                    long j2 = virtualCardEnrollmentDelegate.a;
                    if (j2 != 0) {
                        N.MBzRm4sq(j2);
                        return;
                    }
                    return;
                }
                long j3 = virtualCardEnrollmentDelegate.a;
                if (j3 != 0) {
                    N.MbA3iL6k(j3);
                }
            }
        };
        WindowAndroid windowAndroid = this.e;
        Context context = (Context) windowAndroid.k().get();
        ZX1 s = windowAndroid.s();
        VirtualCardEnrollmentFields virtualCardEnrollmentFields = this.d;
        String str = this.a;
        String str2 = this.b;
        final VirtualCardEnrollmentDelegate virtualCardEnrollmentDelegate = this.c;
        Objects.requireNonNull(virtualCardEnrollmentDelegate);
        C2424Sr c2424Sr = new C2424Sr(context, s, virtualCardEnrollmentFields, str, str2, new InterfaceC2294Rr() { // from class: if4
            @Override // defpackage.InterfaceC2294Rr
            public final void a(int i, String str3) {
                long j = VirtualCardEnrollmentDelegate.this.a;
                if (j != 0) {
                    N.MDUWoeID(j, str3, i);
                }
            }
        }, callback);
        this.f = c2424Sr;
        c2424Sr.a();
    }

    public final void dismiss() {
        C2424Sr c2424Sr = this.f;
        if (c2424Sr != null) {
            c2424Sr.b.c(4, c2424Sr.h);
        }
    }
}
