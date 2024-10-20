package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.ViewFlipper;
import com.android.chrome.R;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.widget.ButtonCompat;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: c3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4085c3 {
    public final C8896q3 a;
    public final C7522m3 b;
    public final C9581s3 c;
    public final QB d;
    public final C3742b3 e;

    /* JADX WARN: Type inference failed for: r2v0, types: [Z2] */
    public C4085c3(WindowAndroid windowAndroid, QB qb, InterfaceC9924t3 interfaceC9924t3) {
        C3742b3 c3742b3 = new C3742b3(this);
        this.e = c3742b3;
        AbstractC9763sb3.a(6);
        C7522m3 c7522m3 = new C7522m3(windowAndroid, interfaceC9924t3, new Runnable() { // from class: Z2
            @Override // java.lang.Runnable
            public final void run() {
                C4085c3 c4085c3 = C4085c3.this;
                c4085c3.a(14);
                ((m) c4085c3.d).l(c4085c3.a, true, 0);
            }
        });
        this.b = c7522m3;
        C8896q3 c8896q3 = new C8896q3((Activity) windowAndroid.k().get(), c7522m3);
        this.a = c8896q3;
        this.c = new C9581s3(c8896q3.j, c7522m3);
        this.d = qb;
        UD2.a(c7522m3.j, c8896q3, new TD2() { // from class: a3
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel = (PropertyModel) wd2;
                C8896q3 c8896q32 = (C8896q3) obj;
                FD2 fd2 = (FD2) obj2;
                JD2 jd2 = AbstractC8553p3.a;
                if (fd2 == jd2) {
                    c8896q32.k.setOnClickListener((View.OnClickListener) propertyModel.i(jd2));
                    return;
                }
                ND2 nd2 = AbstractC8553p3.e;
                if (fd2 == nd2) {
                    int h = propertyModel.h(nd2);
                    ViewFlipper viewFlipper = c8896q32.i;
                    viewFlipper.setDisplayedChild(h);
                    View findViewById = viewFlipper.getChildAt(h).findViewById(C8896q3.m[h]);
                    findViewById.setFocusable(true);
                    findViewById.sendAccessibilityEvent(8);
                    return;
                }
                PD2 pd2 = AbstractC8553p3.b;
                int i = 0;
                if (fd2 == pd2) {
                    C6073hq0 c6073hq0 = (C6073hq0) propertyModel.i(pd2);
                    if (c6073hq0 != null) {
                        View childAt = c8896q32.i.getChildAt(1);
                        PE0.a(c6073hq0, c8896q32.k);
                        ButtonCompat buttonCompat = (ButtonCompat) childAt.findViewById(R.id.account_picker_continue_as_button);
                        Object[] objArr = new Object[1];
                        String str = c6073hq0.d;
                        if (str == null && (str = c6073hq0.c) == null) {
                            str = c6073hq0.a;
                        }
                        objArr[0] = str;
                        buttonCompat.setText(c8896q32.a.getString(R.string.f87230_resource_name_obfuscated_res_0x7f140a6f, objArr));
                        return;
                    }
                    return;
                }
                JD2 jd22 = AbstractC8553p3.c;
                if (fd2 == jd22) {
                    View.OnClickListener onClickListener = (View.OnClickListener) propertyModel.i(jd22);
                    while (true) {
                        ViewFlipper viewFlipper2 = c8896q32.i;
                        if (i >= viewFlipper2.getChildCount()) {
                            return;
                        }
                        ButtonCompat buttonCompat2 = (ButtonCompat) viewFlipper2.getChildAt(i).findViewById(R.id.account_picker_continue_as_button);
                        if (buttonCompat2 != null) {
                            buttonCompat2.setOnClickListener(onClickListener);
                        }
                        i++;
                    }
                } else {
                    JD2 jd23 = AbstractC8553p3.d;
                    if (fd2 == jd23) {
                        c8896q32.l.setOnClickListener((View.OnClickListener) propertyModel.i(jd23));
                        return;
                    }
                    ID2 id2 = AbstractC8553p3.f;
                    if (fd2 == id2 && propertyModel.h(id2) == 1) {
                        c8896q32.w(1);
                        c8896q32.w(2);
                        c8896q32.w(0);
                        c8896q32.l.setText(R.string.f69890_resource_name_obfuscated_res_0x7f1402f4);
                    }
                }
            }
        });
        m mVar = (m) qb;
        mVar.a(c3742b3);
        mVar.p(c8896q3, true);
    }

    public final void a(int i) {
        AbstractC9763sb3.a(i);
        if (this.b.j.h(AbstractC8553p3.f) == 0) {
            C10106tb3.b.a.d("Chrome.AccountPickerBottomSheet.ConsecutiveActiveDismissalCount");
        }
    }
}
