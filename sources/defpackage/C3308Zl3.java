package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.android.chrome.R;
import org.chromium.chrome.browser.omnibox.status.StatusView;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zl3 */
/* loaded from: classes.dex */
public final class C3308Zl3 implements TD2 {
    @Override // defpackage.TD2
    public final void d(WD2 wd2, Object obj, Object obj2) {
        int i;
        PropertyModel propertyModel = (PropertyModel) wd2;
        final StatusView statusView = (StatusView) obj;
        FD2 fd2 = (FD2) obj2;
        LD2 ld2 = AbstractC1878Ol3.a;
        if (!ld2.equals(fd2)) {
            LD2 ld22 = AbstractC1878Ol3.b;
            if (ld22.equals(fd2)) {
                boolean j = propertyModel.j(ld22);
                View view = statusView.a;
                if (view != null || j) {
                    if (view == null) {
                        statusView.a = ((ViewStub) statusView.findViewById(R.id.location_bar_incognito_badge_stub)).inflate();
                    }
                    statusView.a.setVisibility(j ? 0 : 8);
                    statusView.d();
                    return;
                }
                return;
            }
            ND2 nd2 = AbstractC1878Ol3.c;
            if (!nd2.equals(fd2)) {
                LD2 ld23 = AbstractC1878Ol3.d;
                if (ld23.equals(fd2)) {
                    boolean j2 = propertyModel.j(ld23);
                    if (statusView.i == null) {
                        return;
                    }
                    boolean isLayoutRequested = statusView.isLayoutRequested();
                    statusView.i.setVisibility(j2 ? 0 : 8);
                    statusView.d();
                    if (!isLayoutRequested || statusView.getHandler() == null) {
                        return;
                    }
                    statusView.getHandler().post(new Runnable() { // from class: Rl3
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = StatusView.B;
                            StatusView.this.requestLayout();
                        }
                    });
                    return;
                }
                PD2 pd2 = AbstractC1878Ol3.e;
                if (!pd2.equals(fd2)) {
                    ND2 nd22 = AbstractC1878Ol3.f;
                    if (!nd22.equals(fd2)) {
                        ND2 nd23 = AbstractC1878Ol3.g;
                        if (!nd23.equals(fd2)) {
                            MD2 md2 = AbstractC1878Ol3.h;
                            if (md2.equals(fd2)) {
                                float g = propertyModel.g(md2);
                                ImageView imageView = statusView.i;
                                if (imageView == null) {
                                    return;
                                }
                                imageView.setAlpha(g);
                                return;
                            }
                            ND2 nd24 = AbstractC1878Ol3.i;
                            String str = null;
                            if (nd24.equals(fd2)) {
                                int h = propertyModel.h(nd24);
                                if (h != 0) {
                                    str = statusView.getResources().getString(h);
                                    i = 1;
                                } else {
                                    i = 2;
                                }
                                statusView.i.setContentDescription(str);
                                statusView.setImportantForAccessibility(i);
                                return;
                            }
                            PD2 pd22 = AbstractC1878Ol3.j;
                            if (pd22.equals(fd2)) {
                                C1748Nl3 c1748Nl3 = (C1748Nl3) propertyModel.i(pd22);
                                if (c1748Nl3 == null) {
                                    statusView.c(null, 0, null);
                                    return;
                                } else {
                                    statusView.c(c1748Nl3.a(statusView.getContext(), statusView.getResources()), c1748Nl3.e, c1748Nl3.f);
                                    return;
                                }
                            }
                            ND2 nd25 = AbstractC1878Ol3.k;
                            if (!nd25.equals(fd2)) {
                                ND2 nd26 = AbstractC1878Ol3.l;
                                if (!nd26.equals(fd2)) {
                                    LD2 ld24 = AbstractC1878Ol3.m;
                                    if (ld24.equals(fd2)) {
                                        boolean j3 = propertyModel.j(ld24);
                                        statusView.getClass();
                                        int i2 = j3 ? 0 : 8;
                                        statusView.j.setVisibility(i2);
                                        statusView.k.setVisibility(i2);
                                        statusView.l.setVisibility(i2);
                                        return;
                                    }
                                    ND2 nd27 = AbstractC1878Ol3.n;
                                    if (nd27.equals(fd2)) {
                                        statusView.j.setMaxWidth(propertyModel.h(nd27));
                                        return;
                                    }
                                    return;
                                }
                                statusView.j.setText(propertyModel.h(nd26));
                                return;
                            }
                            statusView.j.setTextColor(propertyModel.h(nd25));
                            return;
                        }
                        statusView.r = propertyModel.h(nd23);
                        return;
                    }
                    statusView.q = propertyModel.h(nd22);
                    return;
                }
                statusView.setOnClickListener((View.OnClickListener) propertyModel.i(pd2));
                return;
            }
            statusView.k.setBackgroundColor(propertyModel.h(nd2));
            return;
        }
        statusView.m = propertyModel.j(ld2);
    }
}
