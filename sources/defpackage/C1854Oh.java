package defpackage;

import J.N;
import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.chromium.base.BundleUtils;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.ApplicationLifetime;
import org.chromium.ui.base.ResourceBundle;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Oh */
/* loaded from: classes.dex */
public final class C1854Oh {
    public final Activity a;
    public final ZX1 b;
    public final PropertyModel c;
    public final PropertyModel d;
    public C1465Lh e;
    public final KH f;

    public C1854Oh(a aVar, InterfaceC7697ma2 interfaceC7697ma2, KH kh) {
        this.a = aVar;
        ZX1 zx1 = (ZX1) ((C8385oa2) interfaceC7697ma2).g;
        this.b = zx1;
        this.f = kh;
        Resources resources = aVar.getResources();
        FD2[] fd2Arr = AbstractC4249cY1.B;
        BD2 bd2 = new BD2(fd2Arr);
        JD2 jd2 = AbstractC4249cY1.a;
        bd2.e(jd2, new C2998Xb3(zx1, new Callback() { // from class: Gh
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int intValue = ((Integer) obj).intValue();
                final C1854Oh c1854Oh = C1854Oh.this;
                if (intValue == 1) {
                    if (TextUtils.equals(AbstractC4649di.a(), c1854Oh.e.k.a)) {
                        EI2.h(3, 5, "LanguageSettings.AppLanguagePrompt.Action");
                    } else {
                        EI2.h(2, 5, "LanguageSettings.AppLanguagePrompt.Action");
                    }
                    Activity activity = c1854Oh.a;
                    View inflate = LayoutInflater.from(activity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e003c, (ViewGroup) null, false);
                    final C10230tw1 c10230tw1 = c1854Oh.e.k;
                    String string = activity.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1405a8, c10230tw1.b);
                    final TextView textView = (TextView) inflate.findViewById(R.id.message);
                    textView.setText(string);
                    PropertyModel propertyModel = c1854Oh.d;
                    propertyModel.o(AbstractC4249cY1.h, inflate);
                    if (C8178nx1.f == null) {
                        C8178nx1.f = new C8178nx1();
                    }
                    C8178nx1 c8178nx1 = C8178nx1.f;
                    c8178nx1.getClass();
                    Set hashSet = !BundleUtils.c() ? new HashSet(Arrays.asList(ResourceBundle.a)) : c8178nx1.c.f();
                    String str = c10230tw1.a;
                    if (!(hashSet.contains(str) || TextUtils.equals(str, null))) {
                        c1854Oh.b.l(propertyModel, 1, false);
                    }
                    final boolean equals = TextUtils.equals(AbstractC4649di.a(), str);
                    if (!equals) {
                        C1465Lh c1465Lh = c1854Oh.e;
                        EI2.b("LanguageSettings.AppLanguagePrompt.IsTopLanguageSelected", c1465Lh.i.contains(c1465Lh.k));
                    }
                    N.MUccXkXt("LanguageSettings.AppLanguagePrompt.Language", TextUtils.equals(str, null) ? "" : str);
                    AbstractC4649di.c(str, new InterfaceC7834mx1() { // from class: Ih
                        @Override // defpackage.InterfaceC7834mx1
                        public final void a(boolean z) {
                            C1854Oh c1854Oh2 = C1854Oh.this;
                            if (!z) {
                                Activity activity2 = c1854Oh2.a;
                                textView.setText(activity2.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1405a6, c10230tw1.b));
                                c1854Oh2.d.o(AbstractC4249cY1.j, activity2.getText(R.string.0_resource_name_obfuscated_res_0x7f140717).toString());
                            } else if (equals) {
                                c1854Oh2.getClass();
                            } else {
                                c1854Oh2.f.getClass();
                                ApplicationLifetime.terminate(true);
                            }
                        }
                    });
                } else {
                    c1854Oh.getClass();
                    if (intValue == 2) {
                        EI2.h(0, 5, "LanguageSettings.AppLanguagePrompt.Action");
                    } else if (intValue == 5) {
                        EI2.h(1, 5, "LanguageSettings.AppLanguagePrompt.Action");
                    } else {
                        EI2.h(4, 5, "LanguageSettings.AppLanguagePrompt.Action");
                    }
                }
                EI2.b("LanguageSettings.AppLanguagePrompt.OtherLanguagesShown", c1854Oh.e.l);
                N.M_jSkroX();
            }
        }));
        bd2.d(AbstractC4249cY1.c, resources, R.string.0_resource_name_obfuscated_res_0x7f1405aa);
        bd2.d(AbstractC4249cY1.j, resources, R.string.0_resource_name_obfuscated_res_0x7f140717);
        bd2.d(AbstractC4249cY1.n, resources, R.string.0_resource_name_obfuscated_res_0x7f1402f4);
        bd2.c(AbstractC4249cY1.v, 1);
        this.c = bd2.a();
        HashMap e = PropertyModel.e(fd2Arr);
        C2998Xb3 c2998Xb3 = new C2998Xb3(zx1, new Callback() { // from class: Hh
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                ((Integer) obj).intValue();
                C1854Oh.this.getClass();
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        });
        GD2 gd2 = new GD2();
        gd2.a = c2998Xb3;
        this.d = AbstractC1996Pj1.a(e, jd2, gd2, e);
    }
}
