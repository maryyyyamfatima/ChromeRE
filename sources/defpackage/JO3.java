package defpackage;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JO3 extends J4 {
    public final ER3 a;
    public final Window.Callback b;
    public final IO3 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final EO3 h = new EO3(this);

    @Override // defpackage.J4
    public final void h() {
    }

    @Override // defpackage.J4
    public final void m(boolean z) {
    }

    @Override // defpackage.J4
    public final void p(boolean z) {
    }

    public JO3(Toolbar toolbar, CharSequence charSequence, WindowCallbackC11155wf windowCallbackC11155wf) {
        FO3 fo3 = new FO3(this);
        ER3 er3 = new ER3(toolbar, false);
        this.a = er3;
        this.b = windowCallbackC11155wf;
        er3.k = windowCallbackC11155wf;
        toolbar.N = fo3;
        if (!er3.g) {
            er3.h = charSequence;
            if ((er3.b & 8) != 0) {
                toolbar.G(charSequence);
                if (er3.g) {
                    Ec4.n(charSequence, toolbar.getRootView());
                }
            }
        }
        this.c = new IO3(this);
    }

    @Override // defpackage.J4
    public final void o() {
        this.a.b(R.string.f81880_resource_name_obfuscated_res_0x7f14084c);
    }

    @Override // defpackage.J4
    public final boolean g() {
        ER3 er3 = this.a;
        Toolbar toolbar = er3.a;
        EO3 eo3 = this.h;
        toolbar.removeCallbacks(eo3);
        WeakHashMap weakHashMap = Ec4.a;
        er3.a.postOnAnimation(eo3);
        return true;
    }

    @Override // defpackage.J4
    public final void i() {
        this.a.a.removeCallbacks(this.h);
    }

    @Override // defpackage.J4
    public final Context f() {
        return this.a.a.getContext();
    }

    @Override // defpackage.J4
    public final void q(int i) {
        ER3 er3 = this.a;
        CharSequence text = i != 0 ? er3.a.getContext().getText(i) : null;
        er3.g = true;
        er3.h = text;
        if ((er3.b & 8) != 0) {
            Toolbar toolbar = er3.a;
            toolbar.G(text);
            if (er3.g) {
                Ec4.n(text, toolbar.getRootView());
            }
        }
    }

    @Override // defpackage.J4
    public final void r(CharSequence charSequence) {
        ER3 er3 = this.a;
        if (er3.g) {
            return;
        }
        er3.h = charSequence;
        if ((er3.b & 8) != 0) {
            Toolbar toolbar = er3.a;
            toolbar.G(charSequence);
            if (er3.g) {
                Ec4.n(charSequence, toolbar.getRootView());
            }
        }
    }

    @Override // defpackage.J4
    public final boolean a() {
        return this.a.a.r();
    }

    @Override // defpackage.J4
    public final int d() {
        return this.a.b;
    }

    @Override // defpackage.J4
    public final void n(boolean z) {
        ER3 er3 = this.a;
        er3.a((er3.b & (-5)) | 4);
    }

    @Override // defpackage.J4
    public final boolean k(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            l();
        }
        return true;
    }

    @Override // defpackage.J4
    public final boolean j(int i, KeyEvent keyEvent) {
        Menu t = t();
        if (t == null) {
            return false;
        }
        t.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return t.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.J4
    public final void c(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        ArrayList arrayList = this.g;
        if (arrayList.size() <= 0) {
            return;
        }
        X5.a(arrayList.get(0));
        throw null;
    }

    public final Menu t() {
        boolean z = this.e;
        ER3 er3 = this.a;
        if (!z) {
            GO3 go3 = new GO3(this);
            HO3 ho3 = new HO3(this);
            Toolbar toolbar = er3.a;
            toolbar.S = go3;
            toolbar.T = ho3;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.z = go3;
                actionMenuView.A = ho3;
            }
            this.e = true;
        }
        return er3.a.o();
    }

    @Override // defpackage.J4
    public final boolean l() {
        ActionMenuView actionMenuView = this.a.a.a;
        if (actionMenuView == null) {
            return false;
        }
        C4097c5 c4097c5 = actionMenuView.y;
        return c4097c5 != null && c4097c5.l();
    }

    @Override // defpackage.J4
    public final int e() {
        return this.a.a.getHeight();
    }

    @Override // defpackage.J4
    public final boolean b() {
        C12098zO3 c12098zO3 = this.a.a.R;
        if (!((c12098zO3 == null || c12098zO3.g == null) ? false : true)) {
            return false;
        }
        C6287iT1 c6287iT1 = c12098zO3 == null ? null : c12098zO3.g;
        if (c6287iT1 != null) {
            c6287iT1.collapseActionView();
        }
        return true;
    }
}
