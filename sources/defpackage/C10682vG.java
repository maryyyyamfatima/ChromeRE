package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.LruCache;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.ui.favicon.FaviconHelper$FaviconImageCallback;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10682vG extends RC1 {
    public C10682vG(View view) {
        super(view);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [hh0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [uG] */
    @Override // defpackage.RC1
    public final void v(PropertyModel propertyModel, OC1 oc1) {
        IC1 ic1 = (IC1) oc1;
        View view = this.a;
        ((TextView) view.findViewById(R.id.domain)).setText((CharSequence) ic1.d.second);
        final ImageView imageView = (ImageView) view.findViewById(R.id.favicon);
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.f30480_resource_name_obfuscated_res_0x7f08017a);
        if (imageView != null) {
            C9796sh0 c9796sh0 = (C9796sh0) propertyModel.i(GD1.u);
            final ?? r2 = new Callback() { // from class: uG
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C10682vG c10682vG = C10682vG.this;
                    c10682vG.getClass();
                    imageView.setImageDrawable(new BitmapDrawable(c10682vG.a.getResources(), (Bitmap) obj));
                }
            };
            C11854yh0 c11854yh0 = c9796sh0.a;
            c11854yh0.getClass();
            final ?? r1 = new Callback() { // from class: hh0
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    r2.onResult((Bitmap) obj);
                }
            };
            final C4168cI0 c4168cI0 = c11854yh0.c;
            LruCache lruCache = c4168cI0.c.a;
            final String str = ic1.e;
            Bitmap bitmap = (Bitmap) lruCache.get(str);
            if (bitmap != null) {
                r1.onResult(bitmap);
            } else {
                c4168cI0.b.a(c4168cI0.a, str, dimensionPixelSize, new FaviconHelper$FaviconImageCallback() { // from class: aI0
                    @Override // org.chromium.chrome.browser.ui.favicon.FaviconHelper$FaviconImageCallback
                    public final void onFaviconAvailable(Bitmap bitmap2, GURL gurl) {
                        C4168cI0 c4168cI02 = C4168cI0.this;
                        if (bitmap2 != null) {
                            c4168cI02.c.a.put(str, bitmap2);
                        } else {
                            c4168cI02.getClass();
                        }
                        r1.onResult(bitmap2);
                    }
                });
            }
        }
    }
}
