package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lZ3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractAlertDialogC7349lZ3 extends AlertDialog implements DialogInterface.OnClickListener, InterfaceC6661jZ3 {
    public final AbstractC7005kZ3 a;
    public final C11885ym1 g;

    public abstract AbstractC7005kZ3 a(Context context, double d, double d2);

    public AbstractAlertDialogC7349lZ3(Context context, C11885ym1 c11885ym1, int i, int i2, double d, double d2) {
        super(context, 0);
        this.g = c11885ym1;
        setButton(-1, context.getText(R.string.f71970_resource_name_obfuscated_res_0x7f1403e7), this);
        setButton(-2, context.getText(android.R.string.cancel), (DialogInterface.OnClickListener) null);
        setIcon(0);
        AbstractC7005kZ3 a = a(context, d, d2);
        this.a = a;
        setView(a);
        a.h(i, i2);
        a.i();
        a.h = this;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C11885ym1 c11885ym1 = this.g;
        if (c11885ym1 != null) {
            AbstractC7005kZ3 abstractC7005kZ3 = this.a;
            abstractC7005kZ3.clearFocus();
            int g = abstractC7005kZ3.g();
            int f = abstractC7005kZ3.f();
            int i2 = c11885ym1.a;
            if (i2 == 11) {
                c11885ym1.b.b(i2, g, f, 0, 0, 0, 0, 0, 0);
            } else {
                c11885ym1.b.b(i2, g, 0, 0, 0, 0, 0, 0, f);
            }
        }
    }
}
