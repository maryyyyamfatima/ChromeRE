package defpackage;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.Patterns;
import android.view.ContextThemeWrapper;
import android.view.accessibility.AccessibilityManager;
import android.webkit.URLUtil;
import android.widget.TextView;
import com.android.chrome.R;
import com.google.protobuf.MessageLite;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yr3 */
/* loaded from: classes.dex */
public abstract class AbstractC3208Yr3 {
    public static final long a = TimeUnit.DAYS.toMillis(1);
    public static final /* synthetic */ int b = 0;

    public static String f() {
        Context context = OP0.b;
        ((C8230o61) ((InterfaceC7886n61) C7542m61.g.a.get())).getClass();
        return (String) C8230o61.a.a(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C8138nq3 c(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3208Yr3.c(android.content.Context):nq3");
    }

    public static MessageLite g(QX0 qx0, byte[] bArr) {
        try {
            JX0 jx0 = (JX0) qx0.l(PX0.NEW_BUILDER);
            jx0.m(qx0);
            jx0.n(bArr, bArr.length, XF0.d());
            return jx0.j();
        } catch (C1127Ir1 e) {
            throw new IllegalStateException(e);
        }
    }

    public static void b(final Activity activity, TextView textView, String str, InterfaceC3078Xr3 interfaceC3078Xr3) {
        Resources resources = activity.getResources();
        Context context = OP0.b;
        ((C3424a71) ((Z61) Y61.g.a.get())).getClass();
        if (OP0.c(((Boolean) C3424a71.a.a(context)).booleanValue()) && ((UiModeManager) AbstractC0729Fp3.a(new InterfaceC0209Bp3() { // from class: Tr3
            @Override // defpackage.InterfaceC0209Bp3
            public final Object get() {
                return (UiModeManager) activity.getSystemService("uimode");
            }
        }).get()).getCurrentModeType() == 3) {
            textView.setText(resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140aaf));
        } else {
            String string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140a9f);
            String string2 = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140abd);
            String string3 = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140ac6);
            SpannableString spannableString = new SpannableString(resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140aae, string, string2, string3));
            o(spannableString, string, new C2688Ur3(interfaceC3078Xr3));
            o(spannableString, string2, new C2818Vr3(str, activity));
            o(spannableString, string3, new C2948Wr3(activity, str));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(spannableString);
        }
        Context context2 = OP0.b;
        S61 s61 = S61.g;
        ((U61) ((T61) s61.a.get())).getClass();
        if (OP0.c(((Boolean) U61.d.a(context2)).booleanValue())) {
            String packageName = activity.getPackageName();
            Context context3 = OP0.b;
            ((U61) ((T61) s61.a.get())).getClass();
            if (l(packageName, (String) U61.a.a(context3))) {
                Ec4.m(textView, new WY3(textView));
            }
        }
        if (Build.VERSION.SDK_INT < 26) {
            Ec4.m(textView, new YB1(textView));
        }
    }

    public static void o(SpannableString spannableString, String str, ClickableSpan clickableSpan) {
        int indexOf = spannableString.toString().indexOf(str);
        int length = str.length() + indexOf;
        if (indexOf > -1) {
            spannableString.setSpan(clickableSpan, indexOf, length, 0);
        }
    }

    public static ArrayList k(ContextThemeWrapper contextThemeWrapper, String str, Bundle bundle) {
        Resources resources = contextThemeWrapper.getResources();
        C8138nq3 c = c(contextThemeWrapper);
        C6762jq3 c6762jq3 = c.j;
        if (c6762jq3 == null) {
            c6762jq3 = C6762jq3.m;
        }
        C3350Zu0 c3350Zu0 = c6762jq3.l;
        if (c3350Zu0 == null) {
            c3350Zu0 = C3350Zu0.l;
        }
        C5044eq3 c5044eq3 = c6762jq3.j;
        if (c5044eq3 == null) {
            c5044eq3 = C5044eq3.l;
        }
        C6419iq3 c6419iq3 = c6762jq3.k;
        if (c6419iq3 == null) {
            c6419iq3 = C6419iq3.r;
        }
        C7794mq3 c7794mq3 = c.k;
        if (c7794mq3 == null) {
            c7794mq3 = C7794mq3.n;
        }
        ArrayList arrayList = new ArrayList(15);
        long nanos = TimeUnit.SECONDS.toNanos(c3350Zu0.j) + c3350Zu0.k;
        a(R.string.0_resource_name_obfuscated_res_0x7f140aa9, str, arrayList, resources);
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        a(R.string.0_resource_name_obfuscated_res_0x7f140ac8, String.format("%02d:%02d:%02d", Long.valueOf(timeUnit.toHours(nanos)), Long.valueOf(timeUnit.toMinutes(nanos) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(nanos))), Long.valueOf(timeUnit.toSeconds(nanos) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(nanos)))), arrayList, resources);
        a(R.string.0_resource_name_obfuscated_res_0x7f140aca, c5044eq3.j, arrayList, resources);
        a(R.string.0_resource_name_obfuscated_res_0x7f140ac9, c5044eq3.k, arrayList, resources);
        a(R.string.0_resource_name_obfuscated_res_0x7f140aa8, c6419iq3.j, arrayList, resources);
        a(R.string.0_resource_name_obfuscated_res_0x7f140aa5, c6419iq3.k, arrayList, resources);
        a(R.string.0_resource_name_obfuscated_res_0x7f140aba, c6419iq3.m, arrayList, resources);
        a(R.string.0_resource_name_obfuscated_res_0x7f140aa2, c6419iq3.n, arrayList, resources);
        a(R.string.0_resource_name_obfuscated_res_0x7f140aa1, c6419iq3.o, arrayList, resources);
        a(R.string.0_resource_name_obfuscated_res_0x7f140aa3, c6419iq3.p, arrayList, resources);
        a(R.string.0_resource_name_obfuscated_res_0x7f140aad, c6419iq3.q, arrayList, resources);
        int i = c6419iq3.l;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 3 : 2 : 1;
        int i3 = 4;
        if (i2 == 0) {
            i2 = 4;
        }
        a(R.string.0_resource_name_obfuscated_res_0x7f140ab9, AbstractC6076hq3.c(i2), arrayList, resources);
        int i4 = c7794mq3.j;
        if (i4 == 0) {
            i3 = 1;
        } else if (i4 == 1) {
            i3 = 2;
        } else if (i4 == 2) {
            i3 = 3;
        } else if (i4 != 3) {
            i3 = 0;
        }
        if (i3 == 0) {
            i3 = 5;
        }
        a(R.string.0_resource_name_obfuscated_res_0x7f140abc, AbstractC7450lq3.c(i3), arrayList, resources);
        a(R.string.0_resource_name_obfuscated_res_0x7f140ab0, c7794mq3.k, arrayList, resources);
        StringBuilder sb = new StringBuilder();
        for (String str2 : bundle.keySet()) {
            sb.append(String.format("%s %s %s\n", str2, contextThemeWrapper.getString(R.string.0_resource_name_obfuscated_res_0x7f140ac0), bundle.get(str2)));
        }
        a(R.string.0_resource_name_obfuscated_res_0x7f140aa4, sb.toString(), arrayList, resources);
        return arrayList;
    }

    public static void a(int i, String str, ArrayList arrayList, Resources resources) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(new C8776pi2(resources.getString(i), str));
    }

    public static Drawable j(Context context) {
        Object obj = Y50.a;
        return i(context.getColor(R.color.0_resource_name_obfuscated_res_0x7f070878), context, context.getDrawable(R.drawable.0_resource_name_obfuscated_res_0x7f0904a2));
    }

    public static Drawable i(int i, Context context, Drawable drawable) {
        Drawable mutate = drawable.getConstantState().newDrawable(context.getResources()).mutate();
        mutate.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        return mutate;
    }

    public static boolean m(Context context) {
        return ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
    }

    public static String d(PackageInfo packageInfo) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null && signatureArr.length > 0) {
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(packageInfo.signatures[0].toByteArray());
                if (digest == null) {
                    return null;
                }
                StringBuilder sb = new StringBuilder(digest.length * 2);
                for (byte b2 : digest) {
                    sb.append(String.format("%02x", Byte.valueOf(b2)));
                }
                return sb.toString();
            } catch (NoSuchAlgorithmException e) {
                Log.e("SurveyUtils", "Can't find SHA1.", e);
            }
        }
        return null;
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str) || !Patterns.WEB_URL.matcher(AbstractC6722jk.a(str)).matches()) {
            Log.e("SurveyUtils", "Follow up URL was empty or invalid.");
            return "";
        }
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            Uri parse = Uri.parse(str);
            try {
                if (!OP0.b(C3768b71.a(OP0.b))) {
                    return new URI(parse.getScheme(), parse.getAuthority(), parse.getPath(), parse.getQuery() != null ? URLEncoder.encode(parse.getQuery(), "utf-8") : "").toString();
                }
                return new URI(parse.getScheme(), parse.getAuthority(), parse.getPath(), parse.getQuery(), null).toString();
            } catch (UnsupportedEncodingException | URISyntaxException e) {
                Log.e("SurveyUtils", e.getMessage());
            }
        }
        Log.e("SurveyUtils", "Follow up URL is not http or https.");
        return "";
    }

    public static boolean l(String str, String str2) {
        String[] split = TextUtils.split(str2, ",");
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].trim();
        }
        for (String str3 : split) {
            if (TextUtils.equals(str3, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean n(C2553Tq3 c2553Tq3) {
        C2683Uq3 c2683Uq3 = c2553Tq3.m;
        if (c2683Uq3 == null) {
            c2683Uq3 = C2683Uq3.l;
        }
        return c2683Uq3.j;
    }

    public static boolean p(C2553Tq3 c2553Tq3) {
        C7800mr3 c7800mr3;
        if (c2553Tq3.n.size() > 1) {
            return true;
        }
        C4363cr3 c4363cr3 = (C4363cr3) c2553Tq3.n.get(0);
        int i = c4363cr3.p;
        char c = 5;
        char c2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? (char) 0 : (char) 5 : (char) 4 : (char) 3 : (char) 2 : (char) 1;
        if (c2 == 0) {
            c2 = 6;
        }
        if (c2 != 2) {
            if (i == 0) {
                c = 1;
            } else if (i == 1) {
                c = 2;
            } else if (i == 2) {
                c = 3;
            } else if (i == 3) {
                c = 4;
            } else if (i != 4) {
                c = 0;
            }
            return (c != 0 ? c : (char) 6) != 4;
        }
        if (c4363cr3.j == 4) {
            c7800mr3 = (C7800mr3) c4363cr3.k;
        } else {
            c7800mr3 = C7800mr3.l;
        }
        C3670aq3 c3670aq3 = c7800mr3.j;
        if (c3670aq3 == null) {
            c3670aq3 = C3670aq3.k;
        }
        Iterator it = c3670aq3.j.iterator();
        while (it.hasNext()) {
            int i2 = ((C3328Zp3) it.next()).j;
            char c3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? (char) 0 : (char) 4 : (char) 3 : (char) 2 : (char) 1;
            if (c3 == 0) {
                c3 = 5;
            }
            if (c3 == 3) {
                return true;
            }
        }
        return false;
    }

    public static Bundle h(C3676ar3 c3676ar3) {
        C3333Zq3 c3333Zq3 = c3676ar3.j;
        if (c3333Zq3 == null) {
            c3333Zq3 = C3333Zq3.l;
        }
        InterfaceC1377Kp1 interfaceC1377Kp1 = c3333Zq3.j;
        int size = interfaceC1377Kp1.size();
        Bundle bundle = new Bundle(size);
        for (int i = 0; i < size; i++) {
            C3203Yq3 c3203Yq3 = (C3203Yq3) interfaceC1377Kp1.get(i);
            bundle.putString(c3203Yq3.j, c3203Yq3.k);
        }
        return bundle;
    }
}
