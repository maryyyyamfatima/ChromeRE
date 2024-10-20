package defpackage;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.widget.TextView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vy2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC10927vy2 extends DialogInterfaceOnCancelListenerC7423lm0 implements DialogInterface.OnClickListener {
    public AbstractC9826sm0 r0;
    public CharSequence s0;
    public CharSequence t0;
    public CharSequence u0;
    public CharSequence v0;
    public int w0;
    public BitmapDrawable x0;
    public int y0;

    public abstract void T0(boolean z);

    public void U0(C5490g8 c5490g8) {
    }

    public void V0() {
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public void g0(Bundle bundle) {
        super.g0(bundle);
        InterfaceC10417uV2 R = R(true);
        if (!(R instanceof InterfaceC9483rm0)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        InterfaceC9483rm0 interfaceC9483rm0 = (InterfaceC9483rm0) R;
        String string = A0().getString("key");
        if (bundle == null) {
            AbstractC9826sm0 abstractC9826sm0 = (AbstractC9826sm0) ((AbstractC0123Ay2) interfaceC9483rm0).M0(string);
            this.r0 = abstractC9826sm0;
            this.s0 = abstractC9826sm0.T;
            this.t0 = abstractC9826sm0.W;
            this.u0 = abstractC9826sm0.X;
            this.v0 = abstractC9826sm0.U;
            this.w0 = abstractC9826sm0.Y;
            Drawable drawable = abstractC9826sm0.V;
            if (drawable == null || (drawable instanceof BitmapDrawable)) {
                this.x0 = (BitmapDrawable) drawable;
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            this.x0 = new BitmapDrawable(N(), createBitmap);
            return;
        }
        this.s0 = bundle.getCharSequence("PreferenceDialogFragment.title");
        this.t0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
        this.u0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
        this.v0 = bundle.getCharSequence("PreferenceDialogFragment.message");
        this.w0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
        Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
        if (bitmap != null) {
            this.x0 = new BitmapDrawable(N(), bitmap);
        }
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, androidx.fragment.app.c
    public void s0(Bundle bundle) {
        super.s0(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.s0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.t0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.u0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.v0);
        bundle.putInt("PreferenceDialogFragment.layout", this.w0);
        BitmapDrawable bitmapDrawable = this.x0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0
    public final Dialog M0(Bundle bundle) {
        WindowInsetsController windowInsetsController;
        int ime;
        this.y0 = -2;
        C5490g8 c5490g8 = new C5490g8(B0());
        CharSequence charSequence = this.s0;
        C4115c8 c4115c8 = c5490g8.a;
        c4115c8.d = charSequence;
        c4115c8.c = this.x0;
        c5490g8.g(this.t0, this);
        c4115c8.i = this.u0;
        c4115c8.j = this;
        B0();
        int i = this.w0;
        View view = null;
        if (i != 0) {
            LayoutInflater layoutInflater = this.Q;
            if (layoutInflater == null) {
                layoutInflater = y0(null);
            }
            view = layoutInflater.inflate(i, (ViewGroup) null);
        }
        if (view != null) {
            S0(view);
            c4115c8.q = view;
        } else {
            c4115c8.f = this.v0;
        }
        U0(c5490g8);
        DialogC5834h8 a = c5490g8.a();
        if (this instanceof C2965Wv0) {
            Window window = a.getWindow();
            if (Build.VERSION.SDK_INT < 30) {
                V0();
            } else {
                windowInsetsController = window.getDecorView().getWindowInsetsController();
                ime = WindowInsets.Type.ime();
                windowInsetsController.show(ime);
            }
        }
        return a;
    }

    public final AbstractC9826sm0 R0() {
        if (this.r0 == null) {
            this.r0 = (AbstractC9826sm0) ((AbstractC0123Ay2) ((InterfaceC9483rm0) R(true))).M0(A0().getString("key"));
        }
        return this.r0;
    }

    public void S0(View view) {
        int i;
        View findViewById = view.findViewById(R.id.message);
        if (findViewById != null) {
            CharSequence charSequence = this.v0;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.y0 = i;
    }

    @Override // defpackage.DialogInterfaceOnCancelListenerC7423lm0, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        T0(this.y0 == -1);
    }
}
