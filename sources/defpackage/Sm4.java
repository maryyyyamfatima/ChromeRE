package defpackage;

import J.N;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.chrome.R;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$FollowResults;
import org.chromium.chrome.browser.feed.webfeed.WebFeedBridge$WebFeedMetadata;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Sm4 {
    public static final int e = (int) TimeUnit.SECONDS.toMillis(8);
    public final Context a;
    public final Mm4 b;
    public final ViewOnClickListenerC1069If3 c;
    public final Ql4 d;

    public Sm4(Context context, Mm4 mm4, ZX1 zx1, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3) {
        this.a = context;
        this.b = mm4;
        this.c = viewOnClickListenerC1069If3;
        this.d = new Ql4(zx1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Tab tab, WebFeedBridge$FollowResults webFeedBridge$FollowResults, byte[] bArr, GURL gurl, String str, int i) {
        int i2 = webFeedBridge$FollowResults.a;
        int i3 = 0;
        r11 = 0;
        byte b = 0;
        if (i2 == 1) {
            WebFeedBridge$WebFeedMetadata webFeedBridge$WebFeedMetadata = webFeedBridge$FollowResults.b;
            if (webFeedBridge$WebFeedMetadata != null) {
                b(webFeedBridge$WebFeedMetadata.b, webFeedBridge$WebFeedMetadata.e == 2);
                return;
            } else {
                b(str, false);
                return;
            }
        }
        int i4 = i2 == 2 ? R.string.0_resource_name_obfuscated_res_0x7f140bc5 : R.string.0_resource_name_obfuscated_res_0x7f140bbe;
        Pm4 pm4 = new Pm4(this, bArr, gurl, str, 34, i);
        if (((bArr != null && bArr.length != 0) == true || (tab != null && gurl.equals(tab.z()))) != false) {
            if (bArr != null && bArr.length != 0) {
                b = 1;
            }
            if (b == 0) {
                pm4.g = gurl;
                pm4.a = tab;
                Qm4 qm4 = new Qm4(pm4);
                pm4.h = qm4;
                tab.v(qm4);
            }
            i3 = R.string.0_resource_name_obfuscated_res_0x7f140bc2;
        }
        c(this.a.getString(i4), pm4, 40, i3);
    }

    public final void d(int i, byte[] bArr, GURL gurl, String str, int i2) {
        Context context = this.a;
        if (i == 1) {
            c(context.getString(R.string.0_resource_name_obfuscated_res_0x7f140bcc, str), new Pm4(this, bArr, gurl, str, 35, i2), 41, R.string.0_resource_name_obfuscated_res_0x7f140bcb);
        } else {
            c(context.getString(i == 2 ? R.string.0_resource_name_obfuscated_res_0x7f140bc5 : R.string.0_resource_name_obfuscated_res_0x7f140bca), new Lm4(this, bArr, i2, gurl, str), 42, R.string.0_resource_name_obfuscated_res_0x7f140bc2);
        }
    }

    public final void b(String str, boolean z) {
        String string;
        String string2;
        Callback c2327Rx2;
        boolean shouldTriggerHelpUI = LU3.a(Profile.d()).shouldTriggerHelpUI("IPH_WebFeedPostFollowDialog");
        Context context = this.a;
        if (!shouldTriggerHelpUI) {
            c(context.getString(R.string.0_resource_name_obfuscated_res_0x7f140bc1, str), new Jm4(this), 39, R.string.0_resource_name_obfuscated_res_0x7f140bc0);
            return;
        }
        Ql4 ql4 = this.d;
        ql4.b = context;
        String str2 = null;
        View inflate = LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e02eb, (ViewGroup) null);
        EI2.h(!z ? 1 : 0, 2, "ContentSuggestions.Feed.WebFeed.PostFollowDialog.Show");
        if (z) {
            string = ql4.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140bc8, str);
            string2 = ql4.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140bc6);
            str2 = ql4.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140362);
            final Mm4 mm4 = this.b;
            c2327Rx2 = new Callback() { // from class: Pl4
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    if (((Integer) obj).equals(1)) {
                        N.MxULk9PS(0, 37);
                        Mm4.this.a();
                    } else {
                        N.MxULk9PS(0, 38);
                    }
                }
            };
        } else {
            string = ql4.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140bc7, str);
            string2 = ql4.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140717);
            c2327Rx2 = new C2327Rx2();
        }
        String string3 = ql4.b.getString(R.string.0_resource_name_obfuscated_res_0x7f140bc9, str);
        ID2 id2 = Tl4.a;
        JD2 jd2 = Tl4.b;
        JD2 jd22 = Tl4.c;
        HashMap e2 = PropertyModel.e(new FD2[]{id2, jd2, jd22});
        GD2 gd2 = new GD2();
        gd2.a = string3;
        e2.put(jd2, gd2);
        GD2 gd22 = new GD2();
        gd22.a = string;
        e2.put(jd22, gd22);
        DD2 dd2 = new DD2();
        dd2.a = R.drawable.0_resource_name_obfuscated_res_0x7f0904e7;
        e2.put(id2, dd2);
        PropertyModel propertyModel = new PropertyModel(e2);
        Sl4 sl4 = ql4.a;
        sl4.getClass();
        HashMap e3 = PropertyModel.e(AbstractC4249cY1.B);
        PD2 pd2 = AbstractC4249cY1.h;
        GD2 gd23 = new GD2();
        gd23.a = inflate;
        e3.put(pd2, gd23);
        JD2 jd23 = AbstractC4249cY1.a;
        Rl4 rl4 = new Rl4(sl4, c2327Rx2);
        GD2 gd24 = new GD2();
        gd24.a = rl4;
        e3.put(jd23, gd24);
        JD2 jd24 = AbstractC4249cY1.b;
        GD2 gd25 = new GD2();
        gd25.a = string3;
        e3.put(jd24, gd25);
        PD2 pd22 = AbstractC4249cY1.j;
        GD2 gd26 = new GD2();
        gd26.a = string2;
        e3.put(pd22, gd26);
        PD2 pd23 = AbstractC4249cY1.n;
        GD2 gd27 = new GD2();
        gd27.a = str2;
        e3.put(pd23, gd27);
        ID2 id22 = AbstractC4249cY1.v;
        int i = str2 != null ? 1 : 0;
        DD2 dd22 = new DD2();
        dd22.a = i;
        e3.put(id22, dd22);
        sl4.b = new PropertyModel(e3);
        UD2.a(propertyModel, inflate, new TD2() { // from class: Ol4
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel2 = (PropertyModel) wd2;
                View view = (View) obj;
                FD2 fd2 = (FD2) obj2;
                ID2 id23 = Tl4.a;
                if (id23 == fd2) {
                    ((ImageView) view.findViewById(R.id.web_feed_dialog_illustration)).setImageResource(propertyModel2.h(id23));
                    return;
                }
                JD2 jd25 = Tl4.b;
                if (jd25 == fd2) {
                    ((TextView) view.findViewById(R.id.web_feed_dialog_title)).setText((CharSequence) propertyModel2.i(jd25));
                    return;
                }
                JD2 jd26 = Tl4.c;
                if (jd26 == fd2) {
                    ((TextView) view.findViewById(R.id.web_feed_dialog_details)).setText((CharSequence) propertyModel2.i(jd26));
                }
            }
        });
        sl4.a.l(sl4.b, 1, false);
    }

    public final void c(String str, Rm4 rm4, int i, int i2) {
        C12188zf3 a = C12188zf3.a(str, rm4, 0, i);
        a.i = false;
        a.j = e;
        if (i2 != 0) {
            a.d = this.a.getString(i2);
            a.e = null;
        }
        this.c.c(a);
    }
}
