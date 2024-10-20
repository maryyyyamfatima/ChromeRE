package org.chromium.content.browser.selection;

import J.N;
import android.os.Build;
import android.text.TextUtils;
import defpackage.C10614v33;
import defpackage.C2493Te3;
import defpackage.C5666gf3;
import defpackage.C5808h33;
import defpackage.C6010hf3;
import defpackage.C8551p23;
import defpackage.InterfaceC6152i33;
import defpackage.InterfaceC7870n33;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SmartSelectionClient implements InterfaceC6152i33 {
    public long a;
    public final C6010hf3 b;
    public final C10614v33 c;
    public final C2493Te3 d;

    @Override // defpackage.InterfaceC6152i33
    public final void a(int i, float f, float f2) {
    }

    @Override // defpackage.InterfaceC6152i33
    public final void c(C8551p23 c8551p23) {
    }

    @Override // defpackage.InterfaceC6152i33
    public final void f(String str) {
    }

    public SmartSelectionClient(C10614v33 c10614v33, WebContents webContents) {
        this.c = c10614v33;
        if (Build.VERSION.SDK_INT >= 28) {
            this.d = webContents.Q0().j.get() == null ? null : new C2493Te3(webContents);
        }
        this.b = new C6010hf3(c10614v33, webContents, this.d);
        this.a = N.MFA_dMJC(this, webContents);
    }

    public final void onNativeSideDestroyed(long j) {
        this.a = 0L;
        C6010hf3 c6010hf3 = this.b;
        C5666gf3 c5666gf3 = c6010hf3.c;
        if (c5666gf3 != null) {
            c5666gf3.a(false);
            c6010hf3.c = null;
        }
    }

    @Override // defpackage.InterfaceC6152i33
    public final void e() {
        long j = this.a;
        if (j != 0) {
            N.MVHq2mA2(j, this);
        }
        C6010hf3 c6010hf3 = this.b;
        C5666gf3 c5666gf3 = c6010hf3.c;
        if (c5666gf3 != null) {
            c5666gf3.a(false);
            c6010hf3.c = null;
        }
    }

    @Override // defpackage.InterfaceC6152i33
    public final InterfaceC7870n33 b() {
        return this.d;
    }

    @Override // defpackage.InterfaceC6152i33
    public final boolean d(boolean z) {
        long j = this.a;
        if (j == 0) {
            onSurroundingTextReceived(z ? 1 : 0, "", 0, 0);
            return true;
        }
        N.M2GZ6ZNR(j, this, 240, z ? 1 : 0);
        return true;
    }

    public final void onSurroundingTextReceived(int i, String str, int i2, int i3) {
        if (!(!TextUtils.isEmpty(str) && i2 >= 0 && i2 < i3 && i3 <= str.length())) {
            this.c.a(new C5808h33());
            return;
        }
        C6010hf3 c6010hf3 = this.b;
        if (i == 0) {
            c6010hf3.b(0, i2, i3, str);
        } else {
            if (i != 1) {
                return;
            }
            c6010hf3.b(1, i2, i3, str);
        }
    }
}
