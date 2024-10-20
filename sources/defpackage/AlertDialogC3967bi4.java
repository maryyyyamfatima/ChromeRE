package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import java.util.HashMap;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bi4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class AlertDialogC3967bi4 extends AlertDialog {
    public final ZX1 a;
    public PropertyModel g;
    public CharSequence h;
    public C3623ai4 i;
    public C3623ai4 j;
    public View k;

    public AlertDialogC3967bi4(Context context, ZX1 zx1) {
        super(context);
        this.a = zx1;
    }

    @Override // android.app.AlertDialog
    public final void setView(View view) {
        this.k = view;
    }

    @Override // android.app.AlertDialog
    public final void setMessage(CharSequence charSequence) {
        this.h = charSequence;
    }

    @Override // android.app.AlertDialog
    public final void setButton(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        if (i == -1) {
            this.i = new C3623ai4(0, charSequence.toString(), onClickListener);
        } else if (i == -2) {
            this.j = new C3623ai4(1, charSequence.toString(), onClickListener);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.a.c(0, this.g);
    }

    @Override // android.app.Dialog
    public final void show() {
        Zh4 zh4 = new Zh4(this);
        CharSequence charSequence = this.h;
        String charSequence2 = charSequence != null ? charSequence.toString() : null;
        C3623ai4 c3623ai4 = this.i;
        String str = c3623ai4 != null ? c3623ai4.b : null;
        C3623ai4 c3623ai42 = this.j;
        String str2 = c3623ai42 != null ? c3623ai42.b : null;
        HashMap e = PropertyModel.e(AbstractC4249cY1.B);
        JD2 jd2 = AbstractC4249cY1.a;
        GD2 gd2 = new GD2();
        gd2.a = zh4;
        e.put(jd2, gd2);
        PD2 pd2 = AbstractC4249cY1.f;
        GD2 gd22 = new GD2();
        gd22.a = charSequence2;
        e.put(pd2, gd22);
        PD2 pd22 = AbstractC4249cY1.h;
        View view = this.k;
        GD2 gd23 = new GD2();
        gd23.a = view;
        e.put(pd22, gd23);
        PD2 pd23 = AbstractC4249cY1.j;
        GD2 gd24 = new GD2();
        gd24.a = str;
        e.put(pd23, gd24);
        PD2 pd24 = AbstractC4249cY1.n;
        GD2 gd25 = new GD2();
        gd25.a = str2;
        e.put(pd24, gd25);
        PropertyModel propertyModel = new PropertyModel(e);
        this.g = propertyModel;
        this.a.l(propertyModel, 1, false);
    }
}
