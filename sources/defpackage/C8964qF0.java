package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.chromium.chrome.browser.explore_sites.ExploreSitesCategoryCardView;
import org.chromium.chrome.browser.explore_sites.ExploreSitesSite;
import org.chromium.chrome.browser.explore_sites.ExploreSitesTileView;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qF0 */
/* loaded from: classes.dex */
public final class C8964qF0 implements TD2 {
    public final /* synthetic */ ExploreSitesCategoryCardView a;

    public C8964qF0(ExploreSitesCategoryCardView exploreSitesCategoryCardView) {
        this.a = exploreSitesCategoryCardView;
    }

    @Override // defpackage.TD2
    public final void d(WD2 wd2, Object obj, Object obj2) {
        float width;
        Drawable drawable;
        PropertyModel propertyModel = (PropertyModel) wd2;
        ExploreSitesTileView exploreSitesTileView = (ExploreSitesTileView) obj;
        FD2 fd2 = (FD2) obj2;
        PD2 pd2 = ExploreSitesSite.f;
        JD2 jd2 = ExploreSitesSite.d;
        if (fd2 != pd2) {
            if (fd2 == jd2) {
                String str = (String) propertyModel.i(jd2);
                exploreSitesTileView.g.setLines(2);
                exploreSitesTileView.g.setText(str);
                return;
            }
            JD2 jd22 = ExploreSitesSite.e;
            if (fd2 == jd22) {
                ExploreSitesCategoryCardView exploreSitesCategoryCardView = this.a;
                exploreSitesCategoryCardView.getClass();
                ViewOnClickListenerC8621pF0 viewOnClickListenerC8621pF0 = new ViewOnClickListenerC8621pF0(exploreSitesCategoryCardView, (GURL) propertyModel.i(jd22), propertyModel.h(ExploreSitesSite.c));
                exploreSitesTileView.setOnClickListener(viewOnClickListenerC8621pF0);
                exploreSitesTileView.setOnCreateContextMenuListener(viewOnClickListenerC8621pF0);
                exploreSitesTileView.setOnFocusChangeListener(viewOnClickListenerC8621pF0);
                return;
            }
            return;
        }
        Bitmap bitmap = (Bitmap) propertyModel.i(pd2);
        String str2 = (String) propertyModel.i(jd2);
        if (bitmap != null) {
            float size = View.MeasureSpec.getSize(exploreSitesTileView.i.getLayoutParams().width);
            int i = exploreSitesTileView.k;
            if (size == 0.0f) {
                width = i;
            } else {
                width = i * (bitmap.getWidth() / size);
            }
            C5590gR2 c5590gR2 = new C5590gR2(exploreSitesTileView.getResources(), bitmap);
            c5590gR2.b(width);
            drawable = c5590gR2;
        } else {
            exploreSitesTileView.getClass();
            drawable = new BitmapDrawable(exploreSitesTileView.getResources(), exploreSitesTileView.l.a(str2));
        }
        exploreSitesTileView.i.setImageDrawable(drawable);
    }
}
