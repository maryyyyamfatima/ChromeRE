package defpackage;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.components.browser_ui.modaldialog.ModalDialogView;
import org.chromium.components.browser_ui.widget.FadingEdgeScrollView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gY1 */
/* loaded from: classes2.dex */
public abstract class AbstractC5624gY1 implements TD2 {
    @Override // defpackage.TD2
    /* renamed from: a */
    public void d(final PropertyModel propertyModel, final ModalDialogView modalDialogView, FD2 fd2) {
        PD2 pd2 = AbstractC4249cY1.c;
        if (pd2 == fd2) {
            modalDialogView.m.setText((CharSequence) propertyModel.i(pd2));
            modalDialogView.c();
            return;
        }
        ND2 nd2 = AbstractC4249cY1.d;
        if (nd2 == fd2) {
            modalDialogView.m.setMaxLines(propertyModel.h(nd2));
            return;
        }
        PD2 pd22 = AbstractC4249cY1.e;
        if (pd22 == fd2) {
            Drawable drawable = (Drawable) propertyModel.i(pd22);
            modalDialogView.n.setImageDrawable(drawable);
            modalDialogView.c();
            if (drawable != null) {
                modalDialogView.n.setOnClickListener(modalDialogView);
                return;
            }
            return;
        }
        PD2 pd23 = AbstractC4249cY1.f;
        if (pd23 == fd2) {
            modalDialogView.o.setText((CharSequence) propertyModel.i(pd23));
            modalDialogView.c();
            return;
        }
        PD2 pd24 = AbstractC4249cY1.g;
        if (pd24 == fd2) {
            modalDialogView.p.setText((CharSequence) propertyModel.i(pd24));
            modalDialogView.c();
            return;
        }
        PD2 pd25 = AbstractC4249cY1.h;
        if (pd25 == fd2) {
            View view = (View) propertyModel.i(pd25);
            if (modalDialogView.q.getChildCount() > 0) {
                modalDialogView.q.removeAllViews();
            }
            if (view == null) {
                modalDialogView.q.setVisibility(8);
                return;
            }
            AbstractC8540p04.i(view);
            modalDialogView.q.addView(view);
            modalDialogView.q.setVisibility(0);
            return;
        }
        PD2 pd26 = AbstractC4249cY1.i;
        if (pd26 == fd2) {
            View view2 = (View) propertyModel.i(pd26);
            if (modalDialogView.r.getChildCount() > 0) {
                modalDialogView.r.removeAllViews();
            }
            if (view2 != null) {
                AbstractC8540p04.i(view2);
                modalDialogView.r.addView(view2);
                modalDialogView.r.setVisibility(0);
            } else {
                modalDialogView.r.setVisibility(8);
            }
            modalDialogView.b();
            return;
        }
        PD2 pd27 = AbstractC4249cY1.j;
        if (pd27 == fd2) {
            modalDialogView.a(0).setText((String) propertyModel.i(pd27));
            modalDialogView.b();
            return;
        }
        PD2 pd28 = AbstractC4249cY1.k;
        if (pd28 == fd2) {
            Drawable drawable2 = (Drawable) propertyModel.i(pd28);
            Button a = modalDialogView.a(0);
            a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, (Drawable) null, (Drawable) null, (Drawable) null);
            a.setCompoundDrawablePadding(modalDialogView.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0804f4));
            a.setPaddingRelative(modalDialogView.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0804f3), a.getPaddingTop(), a.getPaddingEnd(), a.getPaddingBottom());
            modalDialogView.b();
            return;
        }
        PD2 pd29 = AbstractC4249cY1.l;
        if (pd29 == fd2) {
            modalDialogView.a(0).setContentDescription((String) propertyModel.i(pd29));
            return;
        }
        if (AbstractC4249cY1.m == fd2) {
            modalDialogView.a(0).setEnabled(!propertyModel.j(r0));
            return;
        }
        PD2 pd210 = AbstractC4249cY1.n;
        if (pd210 == fd2) {
            modalDialogView.a(1).setText((String) propertyModel.i(pd210));
            modalDialogView.b();
            return;
        }
        PD2 pd211 = AbstractC4249cY1.o;
        if (pd211 == fd2) {
            modalDialogView.a(1).setContentDescription((String) propertyModel.i(pd211));
            return;
        }
        if (AbstractC4249cY1.p == fd2) {
            modalDialogView.a(1).setEnabled(!propertyModel.j(r0));
            return;
        }
        PD2 pd212 = AbstractC4249cY1.q;
        if (pd212 == fd2) {
            modalDialogView.B.setText((CharSequence) propertyModel.i(pd212));
            modalDialogView.c();
            return;
        }
        LD2 ld2 = AbstractC4249cY1.u;
        if (ld2 == fd2) {
            boolean j = propertyModel.j(ld2);
            if (modalDialogView.w == j) {
                return;
            }
            modalDialogView.w = j;
            CharSequence text = modalDialogView.m.getText();
            Drawable drawable3 = modalDialogView.n.getDrawable();
            modalDialogView.l.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) modalDialogView.findViewById(j ? R.id.scrollable_title_container : R.id.title_container);
            modalDialogView.l = viewGroup;
            modalDialogView.m = (TextView) viewGroup.findViewById(R.id.title);
            modalDialogView.n = (ImageView) modalDialogView.l.findViewById(R.id.title_icon);
            modalDialogView.m.setText(text);
            modalDialogView.c();
            modalDialogView.n.setImageDrawable(drawable3);
            modalDialogView.c();
            if (drawable3 != null) {
                modalDialogView.n.setOnClickListener(modalDialogView);
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) modalDialogView.q.getLayoutParams();
            if (j) {
                layoutParams.height = -2;
                layoutParams.weight = 0.0f;
                FadingEdgeScrollView fadingEdgeScrollView = modalDialogView.k;
                fadingEdgeScrollView.i = 1;
                fadingEdgeScrollView.j = 1;
                fadingEdgeScrollView.invalidate();
            } else {
                layoutParams.height = 0;
                layoutParams.weight = 1.0f;
                FadingEdgeScrollView fadingEdgeScrollView2 = modalDialogView.k;
                fadingEdgeScrollView2.i = 0;
                fadingEdgeScrollView2.j = 0;
                fadingEdgeScrollView2.invalidate();
            }
            modalDialogView.q.setLayoutParams(layoutParams);
            return;
        }
        if (AbstractC4249cY1.a == fd2) {
            modalDialogView.v = new Callback() { // from class: fY1
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    JD2 jd2 = AbstractC4249cY1.a;
                    PropertyModel propertyModel2 = PropertyModel.this;
                    ((InterfaceC3906bY1) propertyModel2.i(jd2)).c(((Integer) obj).intValue(), propertyModel2);
                }
            };
            return;
        }
        if (AbstractC4249cY1.r == fd2) {
            return;
        }
        HD2 hd2 = AbstractC4249cY1.s;
        if (hd2 == fd2) {
            boolean j2 = propertyModel.j(hd2);
            if (modalDialogView.x == j2) {
                return;
            }
            modalDialogView.x = j2;
            if (j2) {
                Button a2 = modalDialogView.a(0);
                Button a3 = modalDialogView.a(1);
                View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: eY1
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view3, MotionEvent motionEvent) {
                        boolean z;
                        int i;
                        int i2 = ModalDialogView.C;
                        ModalDialogView modalDialogView2 = ModalDialogView.this;
                        modalDialogView2.getClass();
                        try {
                            i = 1;
                            z = (MotionEvent.class.getField("FLAG_WINDOW_IS_PARTIALLY_OBSCURED").getInt(null) & motionEvent.getFlags()) != 0;
                        } catch (IllegalAccessException | NoSuchFieldException e) {
                            e = e;
                            z = false;
                        }
                        try {
                            if (motionEvent.getAction() == 0 && !modalDialogView2.y) {
                                modalDialogView2.y = true;
                                if (!z) {
                                    i = 0;
                                }
                                EI2.h(i, 2, "Android.ModalDialog.SecurityFilteredTouchResult");
                            }
                            if (z && modalDialogView2.z != null && motionEvent.getAction() == 0) {
                                modalDialogView2.z.run();
                            }
                        } catch (IllegalAccessException e2) {
                            e = e2;
                            AbstractC4851eH1.a("ModalDialogView", "Reflection failure: " + e, new Object[0]);
                            return z;
                        } catch (NoSuchFieldException e3) {
                            e = e3;
                            AbstractC4851eH1.a("ModalDialogView", "Reflection failure: " + e, new Object[0]);
                            return z;
                        }
                        return z;
                    }
                };
                a2.setFilterTouchesWhenObscured(true);
                a2.setOnTouchListener(onTouchListener);
                a3.setFilterTouchesWhenObscured(true);
                a3.setOnTouchListener(onTouchListener);
                return;
            }
            return;
        }
        JD2 jd2 = AbstractC4249cY1.t;
        if (jd2 == fd2) {
            modalDialogView.z = (Runnable) propertyModel.i(jd2);
            return;
        }
        if (AbstractC4249cY1.b == fd2 || AbstractC4249cY1.v == fd2) {
            return;
        }
        HD2 hd22 = AbstractC4249cY1.w;
        LD2 ld22 = AbstractC4249cY1.z;
        HD2 hd23 = AbstractC4249cY1.x;
        if (hd22 == fd2 || hd23 == fd2 || ld22 == fd2) {
            boolean z = propertyModel.j(hd22) || propertyModel.j(hd23);
            boolean j3 = propertyModel.j(ld22);
            modalDialogView.i = z;
            modalDialogView.j = j3;
            modalDialogView.requestLayout();
        }
    }
}
