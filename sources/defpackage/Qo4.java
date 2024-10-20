package defpackage;

import J.N;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.preference.Preference;
import com.android.chrome.R;
import java.util.regex.Pattern;
import org.chromium.base.Callback;
import org.chromium.components.browser_ui.settings.ChromeImageViewPreference;
import org.chromium.components.favicon.LargeIconBridge;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Qo4 extends ChromeImageViewPreference {
    public final GP c0;
    public final C6408io4 d0;
    public final C7034ke3 e0;
    public boolean f0;

    public Qo4(Context context, GP gp, C6408io4 c6408io4, C7034ke3 c7034ke3) {
        super(context);
        String format;
        this.c0 = gp;
        this.d0 = c6408io4;
        this.e0 = c7034ke3;
        this.L = R.layout.0_resource_name_obfuscated_res_0x7f0e02f7;
        J(new ColorDrawable(0));
        R(c6408io4.g());
        Context context2 = this.a;
        C6751jo4 c6751jo4 = c6408io4.g;
        if (c6751jo4 == null) {
            if (c6408io4.i(c7034ke3.f())) {
                P(context2.getString(R.string.0_resource_name_obfuscated_res_0x7f140262));
            }
        } else {
            if (c6408io4.j()) {
                format = context2.getString(R.string.0_resource_name_obfuscated_res_0x7f140c48);
            } else {
                format = String.format(context2.getString(R.string.0_resource_name_obfuscated_res_0x7f140c39), c6751jo4.f());
            }
            P(format);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: h */
    public final int compareTo(Preference preference) {
        if (!(preference instanceof Qo4)) {
            return super.compareTo(preference);
        }
        Qo4 qo4 = (Qo4) preference;
        boolean o = this.e0.o(22);
        C6408io4 c6408io4 = this.d0;
        if (o) {
            C6408io4 c6408io42 = qo4.d0;
            c6408io4.getClass();
            if (c6408io4 == c6408io42) {
                return 0;
            }
            long h = c6408io42.h();
            long h2 = c6408io4.h();
            if (h < h2) {
                return -1;
            }
            return h == h2 ? 0 : 1;
        }
        return c6408io4.b(qo4.d0);
    }

    @Override // org.chromium.components.browser_ui.settings.ChromeImageViewPreference, androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        TextView textView = (TextView) c1812Ny2.v(R.id.usage_text);
        textView.setVisibility(8);
        boolean o = this.e0.o(22);
        C6408io4 c6408io4 = this.d0;
        Context context = this.a;
        if (o) {
            long h = c6408io4.h();
            if (h > 0) {
                textView.setText(Formatter.formatShortFileSize(context, h));
                textView.setTextSize(13.0f);
                textView.setVisibility(0);
            }
        }
        AbstractC5199fI0.a(context.getResources(), (ImageView) c1812Ny2.v(android.R.id.icon));
        if (this.f0) {
            return;
        }
        GURL gurl = new GURL(c6408io4.a.d());
        Pattern pattern = T34.a;
        if (!TextUtils.isEmpty(gurl.g())) {
            gurl = (GURL) N.MGM8OMf9(gurl);
        }
        Callback callback = new Callback() { // from class: Po4
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Drawable drawable = (Drawable) obj;
                Qo4 qo4 = Qo4.this;
                if (drawable != null) {
                    qo4.J(drawable);
                } else {
                    qo4.getClass();
                }
            }
        };
        GP gp = this.c0;
        if (gp.e == null) {
            gp.e = new LargeIconBridge(gp.b);
        }
        ZH0.a(gp.a, gp.e, gurl, callback);
        this.f0 = true;
    }
}
