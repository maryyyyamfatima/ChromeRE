package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.chromium.base.Callback;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YP0 extends AbstractViewOnClickListenerC1721Ng1 {
    public final String a0;
    public final LargeIconBridge b0;
    public boolean c0;

    public YP0(Context context, String str, LargeIconBridge largeIconBridge) {
        super(context);
        this.a0 = str;
        this.b0 = largeIconBridge;
        R(str);
    }

    @Override // defpackage.AbstractViewOnClickListenerC1721Ng1, org.chromium.components.browser_ui.settings.ChromeBasePreference, androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        ImageView imageView = (ImageView) c1812Ny2.v(R.id.icon);
        Context context = this.a;
        AbstractC5199fI0.a(context.getResources(), imageView);
        if (this.c0) {
            return;
        }
        ZH0.a(context, this.b0, new GURL("https://" + this.a0), new Callback() { // from class: XP0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Drawable drawable = (Drawable) obj;
                YP0 yp0 = YP0.this;
                if (drawable != null) {
                    yp0.J(drawable);
                } else {
                    yp0.getClass();
                }
            }
        });
        this.c0 = true;
    }
}
