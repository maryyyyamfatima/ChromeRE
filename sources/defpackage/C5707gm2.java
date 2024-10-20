package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.chrome.R;
import java.util.HashMap;
import org.chromium.chrome.browser.password_manager.PasswordManagerDialogView;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.widget.ChromeImageButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gm2 */
/* loaded from: classes.dex */
public final class C5707gm2 {
    public final ViewOnLayoutChangeListenerC6737jm2 a;
    public PropertyModel b;

    public C5707gm2(ZX1 zx1, View view, CC cc) {
        this.a = new ViewOnLayoutChangeListenerC6737jm2(new BD2(AbstractC4249cY1.B), zx1, view, cc);
    }

    public final void b() {
        ViewOnLayoutChangeListenerC6737jm2 viewOnLayoutChangeListenerC6737jm2 = this.a;
        viewOnLayoutChangeListenerC6737jm2.k.k(AbstractC7081km2.c, viewOnLayoutChangeListenerC6737jm2.a(viewOnLayoutChangeListenerC6737jm2.g.getHeight()));
        PropertyModel a = viewOnLayoutChangeListenerC6737jm2.i.a();
        viewOnLayoutChangeListenerC6737jm2.j = a;
        viewOnLayoutChangeListenerC6737jm2.a.l(a, viewOnLayoutChangeListenerC6737jm2.m, false);
    }

    public final void a(Context context, C5019em2 c5019em2) {
        View inflate;
        if (c5019em2.i != null) {
            inflate = LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01e6, (ViewGroup) null);
        } else {
            inflate = LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e01e5, (ViewGroup) null);
        }
        JD2 jd2 = AbstractC7081km2.a;
        ID2 id2 = AbstractC7081km2.b;
        JD2 jd22 = AbstractC7081km2.d;
        JD2 jd23 = AbstractC7081km2.e;
        HashMap e = PropertyModel.e(new FD2[]{jd2, id2, AbstractC7081km2.c, jd22, jd23});
        GD2 gd2 = new GD2();
        String str = c5019em2.a;
        gd2.a = str;
        e.put(jd22, gd2);
        GD2 gd22 = new GD2();
        gd22.a = c5019em2.b;
        e.put(jd23, gd22);
        DD2 dd2 = new DD2();
        dd2.a = c5019em2.f;
        e.put(id2, dd2);
        Runnable runnable = c5019em2.i;
        GD2 gd23 = new GD2();
        gd23.a = runnable;
        PropertyModel a = AbstractC1996Pj1.a(e, jd2, gd23, e);
        this.b = a;
        ViewOnLayoutChangeListenerC6737jm2 viewOnLayoutChangeListenerC6737jm2 = this.a;
        viewOnLayoutChangeListenerC6737jm2.getClass();
        viewOnLayoutChangeListenerC6737jm2.l = inflate.getResources();
        viewOnLayoutChangeListenerC6737jm2.k = a;
        int i = c5019em2.d;
        BD2 bd2 = viewOnLayoutChangeListenerC6737jm2.i;
        if (i != 0) {
            bd2.e(AbstractC4249cY1.k, AbstractC2884Wf.a(inflate.getContext(), i));
        }
        bd2.e(AbstractC4249cY1.h, inflate);
        bd2.e(AbstractC4249cY1.a, new C6394im2(c5019em2.g));
        bd2.e(AbstractC4249cY1.b, str);
        bd2.e(AbstractC4249cY1.j, c5019em2.c);
        bd2.e(AbstractC4249cY1.n, c5019em2.e);
        bd2.c(AbstractC4249cY1.v, c5019em2.h ? 1 : 0);
        viewOnLayoutChangeListenerC6737jm2.j = bd2.a();
        viewOnLayoutChangeListenerC6737jm2.m = 1;
        UD2.a(this.b, inflate, new TD2() { // from class: fm2
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel = (PropertyModel) wd2;
                FD2 fd2 = (FD2) obj2;
                PasswordManagerDialogView passwordManagerDialogView = (PasswordManagerDialogView) ((View) obj);
                JD2 jd24 = AbstractC7081km2.a;
                if (jd24 == fd2) {
                    final Runnable runnable2 = (Runnable) propertyModel.i(jd24);
                    ChromeImageButton chromeImageButton = passwordManagerDialogView.a;
                    if (chromeImageButton == null) {
                        return;
                    }
                    chromeImageButton.setOnClickListener(new View.OnClickListener() { // from class: lm2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i2 = PasswordManagerDialogView.k;
                            runnable2.run();
                        }
                    });
                    passwordManagerDialogView.g.setOnClickListener(new View.OnClickListener() { // from class: mm2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i2 = PasswordManagerDialogView.k;
                            runnable2.run();
                        }
                    });
                    passwordManagerDialogView.a.setVisibility(0);
                    return;
                }
                ID2 id22 = AbstractC7081km2.b;
                if (id22 != fd2) {
                    LD2 ld2 = AbstractC7081km2.c;
                    if (ld2 == fd2) {
                        if (propertyModel.j(ld2)) {
                            passwordManagerDialogView.h.setVisibility(0);
                        } else {
                            passwordManagerDialogView.h.setVisibility(8);
                        }
                        boolean z = !propertyModel.j(ld2);
                        if (passwordManagerDialogView.a != null) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) passwordManagerDialogView.i.getLayoutParams();
                            layoutParams.setMarginEnd(passwordManagerDialogView.getResources().getDimensionPixelSize(z ? R.dimen.0_resource_name_obfuscated_res_0x7f08065e : R.dimen.0_resource_name_obfuscated_res_0x7f08065d));
                            passwordManagerDialogView.i.setLayoutParams(layoutParams);
                            passwordManagerDialogView.a.setVisibility(z ? 8 : 0);
                            passwordManagerDialogView.g.setVisibility(z ? 0 : 8);
                        }
                        if (AbstractC0193Bm2.l()) {
                            return;
                        }
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(passwordManagerDialogView.h.getLayoutParams());
                        layoutParams2.setMarginStart(passwordManagerDialogView.getContext().getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08065d));
                        layoutParams2.setMarginEnd(passwordManagerDialogView.getContext().getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08065d));
                        passwordManagerDialogView.h.setLayoutParams(layoutParams2);
                        passwordManagerDialogView.h.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        return;
                    }
                    JD2 jd25 = AbstractC7081km2.d;
                    if (jd25 != fd2) {
                        JD2 jd26 = AbstractC7081km2.e;
                        if (jd26 == fd2) {
                            passwordManagerDialogView.j.setText((CharSequence) propertyModel.i(jd26));
                            return;
                        }
                        return;
                    }
                    passwordManagerDialogView.i.setText((String) propertyModel.i(jd25));
                    return;
                }
                passwordManagerDialogView.h.setImageResource(propertyModel.h(id22));
            }
        });
    }
}
