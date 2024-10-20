package defpackage;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Mn4 extends PC {
    public final LN3 a = LN3.b(new ContextThemeWrapper(V60.a, AbstractC9942t6.b()), R.drawable.f45020_resource_name_obfuscated_res_0x7f0900c5);
    public final InterfaceC5970hY3 b;
    public final D63 c;
    public final In4 d;
    public final Xj4 e;
    public final int f;
    public final Intent g;
    public final Ln4 h;

    @Override // defpackage.PC
    public final int C() {
        return 4;
    }

    @Override // defpackage.PC
    public final boolean P() {
        return false;
    }

    @Override // defpackage.PC
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.PC
    public final boolean R() {
        return false;
    }

    @Override // defpackage.PC
    public final int x() {
        return 1;
    }

    public Mn4(Intent intent, int i, boolean z, D63 d63, In4 in4, Xj4 xj4) {
        InterfaceC5970hY3 c5282fY3;
        this.g = intent;
        this.h = new Ln4(i, z);
        if (in4.g == 4) {
            c5282fY3 = new C5626gY3(0, false);
        } else {
            c5282fY3 = new C5282fY3();
        }
        this.b = c5282fY3;
        this.c = d63;
        this.d = in4;
        this.e = xj4;
        this.f = xj4 == null ? 3 : 4;
    }

    @Override // defpackage.PC
    public final int a() {
        return this.f;
    }

    @Override // defpackage.PC
    public final Intent p() {
        return this.g;
    }

    @Override // defpackage.PC
    public final String g() {
        Xj4 xj4 = this.e;
        if (xj4 != null) {
            return xj4.a;
        }
        return null;
    }

    @Override // defpackage.PC
    public final String D() {
        return this.d.b;
    }

    @Override // defpackage.PC
    public final MW j() {
        return this.h;
    }

    @Override // defpackage.PC
    public final Drawable h() {
        return this.a;
    }

    @Override // defpackage.PC
    public final InterfaceC5970hY3 B() {
        return this.b;
    }

    @Override // defpackage.PC
    public final D63 v() {
        return this.c;
    }

    @Override // defpackage.PC
    public final In4 F() {
        return this.d;
    }

    @Override // defpackage.PC
    public final Xj4 E() {
        return this.e;
    }

    @Override // defpackage.PC
    public final int m() {
        return this.d.h;
    }
}
