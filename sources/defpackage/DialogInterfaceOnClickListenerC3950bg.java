package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.AppCompatSpinner;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bg */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC3950bg implements InterfaceC6012hg, DialogInterface.OnClickListener {
    public DialogC5834h8 a;
    public ListAdapter g;
    public CharSequence h;
    public final /* synthetic */ AppCompatSpinner i;

    @Override // defpackage.InterfaceC6012hg
    public final Drawable c() {
        return null;
    }

    @Override // defpackage.InterfaceC6012hg
    public final int g() {
        return 0;
    }

    @Override // defpackage.InterfaceC6012hg
    public final int p() {
        return 0;
    }

    public DialogInterfaceOnClickListenerC3950bg(AppCompatSpinner appCompatSpinner) {
        this.i = appCompatSpinner;
    }

    @Override // defpackage.InterfaceC6012hg
    public final void dismiss() {
        DialogC5834h8 dialogC5834h8 = this.a;
        if (dialogC5834h8 != null) {
            dialogC5834h8.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.InterfaceC6012hg
    public final boolean a() {
        DialogC5834h8 dialogC5834h8 = this.a;
        if (dialogC5834h8 != null) {
            return dialogC5834h8.isShowing();
        }
        return false;
    }

    @Override // defpackage.InterfaceC6012hg
    public final void f(ListAdapter listAdapter) {
        this.g = listAdapter;
    }

    @Override // defpackage.InterfaceC6012hg
    public final void k(CharSequence charSequence) {
        this.h = charSequence;
    }

    @Override // defpackage.InterfaceC6012hg
    public final CharSequence j() {
        return this.h;
    }

    @Override // defpackage.InterfaceC6012hg
    public final void o(int i, int i2) {
        if (this.g == null) {
            return;
        }
        AppCompatSpinner appCompatSpinner = this.i;
        C5490g8 c5490g8 = new C5490g8(appCompatSpinner.getPopupContext());
        CharSequence charSequence = this.h;
        C4115c8 c4115c8 = c5490g8.a;
        if (charSequence != null) {
            c4115c8.d = charSequence;
        }
        ListAdapter listAdapter = this.g;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        c4115c8.o = listAdapter;
        c4115c8.p = this;
        c4115c8.u = selectedItemPosition;
        c4115c8.t = true;
        DialogC5834h8 a = c5490g8.a();
        this.a = a;
        AlertController$RecycleListView alertController$RecycleListView = a.j.g;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AppCompatSpinner appCompatSpinner = this.i;
        appCompatSpinner.setSelection(i);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick(null, i, this.g.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.InterfaceC6012hg
    public final void e(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.InterfaceC6012hg
    public final void m(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.InterfaceC6012hg
    public final void i(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.InterfaceC6012hg
    public final void n(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
