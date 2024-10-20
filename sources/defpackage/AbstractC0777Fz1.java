package defpackage;

import J.N;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.libraries.lens.sdk.intent.LensImage;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0777Fz1 {
    public final Context a = V60.a;
    public long b;

    public final void a(WindowAndroid windowAndroid, C1297Jz1 c1297Jz1) {
        String str;
        boolean z;
        this.b = SystemClock.elapsedRealtimeNanos();
        NW0 c = NW0.c(V60.a);
        String e = AbstractC2726Uz1.e(V60.a);
        c.getClass();
        String str2 = "";
        if (!NW0.d(e, "12.10")) {
            long j = this.b;
            C1202Jg1 a = C1202Jg1.a();
            Profile d = Profile.d();
            a.getClass();
            CoreAccountInfo b = C1202Jg1.b(d).b(1);
            boolean z2 = c1297Jz1.e;
            if (b != null && !z2) {
                str2 = b.getEmail();
            }
            C11274wz1 c11274wz1 = new C11274wz1();
            byte[] byteArray = C1037Hz1.j.toByteArray();
            Bundle bundle = c11274wz1.a;
            bundle.putByteArray("lens_init_params", byteArray);
            bundle.putLong("request_lens_time_nanos", SystemClock.elapsedRealtimeNanos());
            bundle.putLong("start_streaming_time_nanos", 0L);
            bundle.putInt("transition_type", 0);
            bundle.putInt("intent_type", 0);
            bundle.putInt("theme", 0);
            bundle.putLong("handover_session_id", 0L);
            bundle.putBoolean("is_from_incognito", false);
            bundle.putString("account_name", str2);
            if (!z2) {
                String trim = N.M_cRNcHs().trim();
                if (!trim.isEmpty()) {
                    bundle.putString("chrome_finch_variations", trim);
                }
            }
            Uri uri = c1297Jz1.a;
            if (uri != null) {
                V60.a.grantUriPermission("com.google.android.googlequicksearchbox", uri, 1);
                if (z2) {
                    bundle.putParcelable("postcapture_image", new LensImage(c1297Jz1.a));
                } else {
                    bundle.putParcelable("postcapture_image", new LensImage(c1297Jz1.a, Uri.parse(c1297Jz1.d).getHost(), c1297Jz1.b, c1297Jz1.c));
                }
            }
            bundle.putString("caller_package", V60.a.getPackageName());
            bundle.putString("proactive_session_id", c1297Jz1.g);
            bundle.putInt("proactive_query_id", c1297Jz1.h);
            bundle.putLong("request_lens_time_nanos", j);
            bundle.putBoolean("is_from_incognito", z2);
            bundle.putInt("intent_type", AbstractC2726Uz1.d(c1297Jz1));
            try {
                new C1167Iz1(c11274wz1).a(V60.a);
                return;
            } catch (ActivityNotFoundException e2) {
                AbstractC4851eH1.a("LensController", "Start Lens failed. An ActivityNotFoundException was thrown.", e2);
                return;
            }
        }
        Uri uri2 = c1297Jz1.a;
        boolean z3 = c1297Jz1.e;
        long j2 = this.b;
        String str3 = c1297Jz1.b;
        String str4 = c1297Jz1.c;
        String str5 = c1297Jz1.d;
        String num = Integer.toString(AbstractC2726Uz1.d(c1297Jz1));
        String str6 = c1297Jz1.g;
        int i = c1297Jz1.h;
        C1202Jg1 a2 = C1202Jg1.a();
        Profile d2 = Profile.d();
        a2.getClass();
        CoreAccountInfo b2 = C1202Jg1.b(d2).b(1);
        if (b2 != null && !z3) {
            str2 = b2.getEmail();
        }
        Uri.Builder buildUpon = Uri.parse("googleapp://lens").buildUpon();
        if (uri2 == null || Uri.EMPTY.equals(uri2)) {
            str = "Start Lens failed. An ActivityNotFoundException was thrown.";
        } else {
            str = "Start Lens failed. An ActivityNotFoundException was thrown.";
            buildUpon.appendQueryParameter("LensBitmapUriKey", uri2.toString());
            V60.a.grantUriPermission("com.google.android.googlequicksearchbox", uri2, 1);
        }
        buildUpon.appendQueryParameter("AccountNameUriKey", str2).appendQueryParameter("IncognitoUriKey", Boolean.toString(z3)).appendQueryParameter("ActivityLaunchTimestampNanos", Long.toString(j2));
        if (!TextUtils.isEmpty(num)) {
            buildUpon.appendQueryParameter("lens_intent_type", num);
        }
        if (!z3) {
            if (uri2 != null && !Uri.EMPTY.equals(uri2)) {
                if (str3 != null) {
                    C7928nE c7928nE = UN.a;
                    z = false;
                    if (N.M6bsIDpc("ContextMenuSearchWithGoogleLens", "sendSrc", false)) {
                        buildUpon.appendQueryParameter("ImageSrc", str3);
                    }
                } else {
                    z = false;
                }
                if (str4 != null) {
                    C7928nE c7928nE2 = UN.a;
                    if (N.M6bsIDpc("ContextMenuSearchWithGoogleLens", "sendAlt", z)) {
                        buildUpon.appendQueryParameter("ImageAlt", str4);
                    }
                }
                if (str5 != null) {
                    C7928nE c7928nE3 = UN.a;
                    if (N.M6bsIDpc("ContextMenuSearchWithGoogleLens", "sendPage", z)) {
                        buildUpon.appendQueryParameter("PageUrl", str5);
                    }
                }
                if (str5 != null) {
                    C7928nE c7928nE4 = UN.a;
                    if (N.M6bsIDpc("ContextMenuSearchWithGoogleLens", "sendPageDomain", z)) {
                        buildUpon.appendQueryParameter("PageDomain", Uri.parse(str5).getHost());
                    }
                }
            }
            String trim2 = N.M_cRNcHs().trim();
            if (!trim2.isEmpty()) {
                buildUpon.appendQueryParameter("Gid", trim2);
            }
            if (!TextUtils.isEmpty(str6)) {
                buildUpon.appendQueryParameter("PrSid", str6);
            }
            if (i > 0) {
                buildUpon.appendQueryParameter("PrQid", Integer.toString(i));
            }
        }
        Intent data = new Intent("android.intent.action.VIEW").setData(buildUpon.build());
        data.setPackage("com.google.android.googlequicksearchbox");
        data.addFlags(1);
        try {
            windowAndroid.B(data, null, null);
        } catch (ActivityNotFoundException e3) {
            AbstractC4851eH1.a("LensController", str, e3);
        }
    }
}
