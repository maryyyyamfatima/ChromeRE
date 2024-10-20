package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.components.browser_ui.widget.text.TextViewWithCompoundDrawables;
import org.chromium.components.messages.MessageBannerView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class CU1 {
    public final GU1 a;
    public final MessageBannerView b;
    public final PropertyModel c;
    public final C10754vU1 d;
    public final InterfaceC0079Ap3 e;
    public final Runnable f;

    public CU1(MessageBannerView messageBannerView, PropertyModel propertyModel, InterfaceC0079Ap3 interfaceC0079Ap3, Resources resources, RunnableC7710mc3 runnableC7710mc3, Callback callback, C6678jc3 c6678jc3, RunnableC8054nc3 runnableC8054nc3) {
        this.b = messageBannerView;
        this.c = propertyModel;
        UD2.a(propertyModel, messageBannerView, new TD2() { // from class: yU1
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                MessageBannerView messageBannerView2 = (MessageBannerView) obj;
                FD2 fd2 = (FD2) obj2;
                ND2 nd2 = HU1.b;
                if (fd2 != nd2) {
                    PD2 pd2 = HU1.c;
                    if (fd2 != pd2) {
                        PD2 pd22 = HU1.D;
                        if (fd2 != pd22) {
                            PD2 pd23 = HU1.f;
                            if (fd2 != pd23) {
                                PD2 pd24 = HU1.g;
                                if (fd2 != pd24) {
                                    PD2 pd25 = HU1.h;
                                    if (fd2 == pd25) {
                                        CharSequence charSequence = (CharSequence) propertyModel2.i(pd25);
                                        messageBannerView2.m.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
                                        messageBannerView2.m.setText(charSequence);
                                        return;
                                    }
                                    PD2 pd26 = HU1.i;
                                    LD2 ld2 = HU1.j;
                                    if (fd2 == pd26) {
                                        Drawable drawable = (Drawable) propertyModel2.i(pd26);
                                        messageBannerView2.m.setVisibility(drawable == null ? 8 : 0);
                                        messageBannerView2.z = drawable;
                                        TextViewWithCompoundDrawables textViewWithCompoundDrawables = messageBannerView2.m;
                                        textViewWithCompoundDrawables.m = Y50.b(messageBannerView2.getContext(), R.color.f17860_resource_name_obfuscated_res_0x7f07012a);
                                        textViewWithCompoundDrawables.h(textViewWithCompoundDrawables.getCompoundDrawablesRelative());
                                        messageBannerView2.m.setCompoundDrawablesRelative(drawable, null, null, null);
                                        messageBannerView2.a(propertyModel2.j(ld2));
                                        return;
                                    }
                                    if (fd2 == ld2) {
                                        messageBannerView2.a(propertyModel2.j(ld2));
                                        return;
                                    }
                                    ND2 nd22 = HU1.k;
                                    if (fd2 != nd22) {
                                        PD2 pd27 = HU1.l;
                                        if (fd2 != pd27) {
                                            ND2 nd23 = HU1.m;
                                            if (fd2 != nd23) {
                                                ND2 nd24 = HU1.p;
                                                if (fd2 == nd24) {
                                                    int h = propertyModel2.h(nd24);
                                                    if (h == 0) {
                                                        messageBannerView2.k.setImageTintList(null);
                                                        return;
                                                    } else {
                                                        messageBannerView2.k.setImageTintList(ColorStateList.valueOf(h));
                                                        return;
                                                    }
                                                }
                                                ND2 nd25 = HU1.o;
                                                if (fd2 == nd25) {
                                                    messageBannerView2.b(propertyModel2.h(nd25));
                                                    return;
                                                }
                                                LD2 ld22 = HU1.n;
                                                if (fd2 == ld22) {
                                                    boolean j = propertyModel2.j(ld22);
                                                    int dimensionPixelSize = messageBannerView2.getResources().getDimensionPixelSize(R.dimen.f35740_resource_name_obfuscated_res_0x7f0804e3);
                                                    int dimensionPixelSize2 = messageBannerView2.getResources().getDimensionPixelSize(R.dimen.f35750_resource_name_obfuscated_res_0x7f0804e4);
                                                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) messageBannerView2.k.getLayoutParams();
                                                    if (j) {
                                                        layoutParams.width = dimensionPixelSize2;
                                                        layoutParams.height = dimensionPixelSize2;
                                                    } else {
                                                        layoutParams.width = -2;
                                                        layoutParams.height = dimensionPixelSize;
                                                    }
                                                    messageBannerView2.k.setLayoutParams(layoutParams);
                                                    return;
                                                }
                                                PD2 pd28 = HU1.q;
                                                if (fd2 != pd28) {
                                                    ND2 nd26 = HU1.r;
                                                    if (fd2 != nd26) {
                                                        PD2 pd29 = HU1.s;
                                                        if (fd2 == pd29) {
                                                            String str = (String) propertyModel2.i(pd29);
                                                            messageBannerView2.q.d();
                                                            messageBannerView2.s = str;
                                                            return;
                                                        }
                                                        PD2 pd210 = HU1.u;
                                                        if (fd2 == pd210) {
                                                            ZC1 zc1 = (ZC1) propertyModel2.i(pd210);
                                                            messageBannerView2.q.d();
                                                            messageBannerView2.u = zc1;
                                                            return;
                                                        }
                                                        ND2 nd27 = HU1.v;
                                                        if (fd2 == nd27) {
                                                            int h2 = propertyModel2.h(nd27);
                                                            messageBannerView2.getClass();
                                                            messageBannerView2.q.k = messageBannerView2.getResources().getDimensionPixelSize(h2 == 1 ? R.dimen.f35810_resource_name_obfuscated_res_0x7f0804ea : h2 == 2 ? R.dimen.f35800_resource_name_obfuscated_res_0x7f0804e9 : R.dimen.f35820_resource_name_obfuscated_res_0x7f0804eb);
                                                            return;
                                                        }
                                                        PD2 pd211 = HU1.t;
                                                        if (fd2 != pd211) {
                                                            PD2 pd212 = HU1.E;
                                                            if (fd2 == pd212) {
                                                                Runnable runnable = (Runnable) propertyModel2.i(pd212);
                                                                messageBannerView2.q.d();
                                                                messageBannerView2.t = runnable;
                                                                return;
                                                            }
                                                            PD2 pd213 = HU1.C;
                                                            if (fd2 == pd213) {
                                                                final Runnable runnable2 = (Runnable) propertyModel2.i(pd213);
                                                                if (runnable2 == null) {
                                                                    messageBannerView2.setOnTouchListener(null);
                                                                    return;
                                                                } else {
                                                                    messageBannerView2.setOnTouchListener(new View.OnTouchListener() { // from class: MU1
                                                                        @Override // android.view.View.OnTouchListener
                                                                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                                                                            runnable2.run();
                                                                            return false;
                                                                        }
                                                                    });
                                                                    return;
                                                                }
                                                            }
                                                            MD2 md2 = HU1.B;
                                                            if (fd2 == md2) {
                                                                messageBannerView2.setAlpha(propertyModel2.g(md2));
                                                                return;
                                                            }
                                                            MD2 md22 = HU1.z;
                                                            if (fd2 == md22) {
                                                                messageBannerView2.setTranslationX(propertyModel2.g(md22));
                                                                return;
                                                            }
                                                            MD2 md23 = HU1.A;
                                                            if (fd2 == md23) {
                                                                messageBannerView2.setTranslationY(propertyModel2.g(md23));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        messageBannerView2.q.setContentDescription((String) propertyModel2.i(pd211));
                                                        return;
                                                    }
                                                    messageBannerView2.q.setImageDrawable(AbstractC2884Wf.a(messageBannerView2.getContext(), propertyModel2.h(nd26)));
                                                    messageBannerView2.q.setVisibility(0);
                                                    messageBannerView2.r.setVisibility(0);
                                                    return;
                                                }
                                                messageBannerView2.q.setImageDrawable((Drawable) propertyModel2.i(pd28));
                                                messageBannerView2.q.setVisibility(0);
                                                messageBannerView2.r.setVisibility(0);
                                                return;
                                            }
                                            messageBannerView2.k.setImageDrawable(AbstractC2884Wf.a(messageBannerView2.getContext(), propertyModel2.h(nd23)));
                                            int i = messageBannerView2.x;
                                            if (i >= 0) {
                                                messageBannerView2.b(i);
                                                return;
                                            }
                                            return;
                                        }
                                        messageBannerView2.k.setImageDrawable((Drawable) propertyModel2.i(pd27));
                                        int i2 = messageBannerView2.x;
                                        if (i2 >= 0) {
                                            messageBannerView2.b(i2);
                                            return;
                                        }
                                        return;
                                    }
                                    messageBannerView2.m.setMaxLines(propertyModel2.h(nd22));
                                    messageBannerView2.m.setEllipsize(TextUtils.TruncateAt.END);
                                    return;
                                }
                                messageBannerView2.l.setContentDescription((String) propertyModel2.i(pd24));
                                return;
                            }
                            messageBannerView2.l.setText((String) propertyModel2.i(pd23));
                            Runnable runnable3 = messageBannerView2.w;
                            if (runnable3 != null) {
                                runnable3.run();
                                return;
                            }
                            return;
                        }
                        messageBannerView2.o.setOnClickListener((View.OnClickListener) propertyModel2.i(pd22));
                        return;
                    }
                    messageBannerView2.o.setText((String) propertyModel2.i(pd2));
                    messageBannerView2.c();
                    return;
                }
                messageBannerView2.n = propertyModel2.h(nd2);
                messageBannerView2.c();
            }
        });
        GU1 gu1 = new GU1(propertyModel, interfaceC0079Ap3, resources, runnableC7710mc3, callback);
        this.a = gu1;
        this.e = c6678jc3;
        C10754vU1 c10754vU1 = new C10754vU1();
        this.d = c10754vU1;
        this.f = runnableC8054nc3;
        messageBannerView.getClass();
        messageBannerView.v = new LU1(messageBannerView.getContext(), gu1);
        messageBannerView.y = new BU1(c10754vU1, ((Long) c6678jc3.get()).longValue(), runnableC8054nc3);
    }

    public final void a() {
        StringBuilder sb = new StringBuilder();
        sb.append((String) this.c.i(HU1.f));
        sb.append(" ");
        MessageBannerView messageBannerView = this.b;
        sb.append(messageBannerView.getResources().getString(R.string.f77580_resource_name_obfuscated_res_0x7f140658));
        messageBannerView.announceForAccessibility(sb.toString());
    }
}
