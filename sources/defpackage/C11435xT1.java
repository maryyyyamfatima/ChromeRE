package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xT1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11435xT1 extends BD1 implements InterfaceC5599gT1 {

    /* renamed from: J, reason: collision with root package name */
    public static final Method f11549J;
    public InterfaceC5599gT1 I;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f11549J = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C11435xT1(Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // defpackage.BD1
    public final C5753gu0 q(Context context, boolean z) {
        C11092wT1 c11092wT1 = new C11092wT1(context, z);
        c11092wT1.u = this;
        return c11092wT1;
    }

    @Override // defpackage.InterfaceC5599gT1
    public final void l(BS1 bs1, C6287iT1 c6287iT1) {
        InterfaceC5599gT1 interfaceC5599gT1 = this.I;
        if (interfaceC5599gT1 != null) {
            interfaceC5599gT1.l(bs1, c6287iT1);
        }
    }

    @Override // defpackage.InterfaceC5599gT1
    public final void h(BS1 bs1, MenuItem menuItem) {
        InterfaceC5599gT1 interfaceC5599gT1 = this.I;
        if (interfaceC5599gT1 != null) {
            interfaceC5599gT1.h(bs1, menuItem);
        }
    }
}
