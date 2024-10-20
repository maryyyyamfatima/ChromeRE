package defpackage;

import J.N;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.browser.customtabs.CustomTabsSessionToken;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.document.ChromeLauncherActivity;
import org.chromium.content_public.browser.LoadUrlParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: No1 */
/* loaded from: classes.dex */
public final class C1761No1 {
    public static Pair c;
    public static int d;
    public static String e;
    public static boolean f;
    public static C7073kl0 g;
    public final InterfaceC1631Mo1 a;
    public final Activity b;

    public static Intent a(int i, int i2) {
        Context context = V60.a;
        Intent intent = new Intent(context, (Class<?>) ChromeLauncherActivity.class);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        intent.putExtra("BRING_TAB_TO_FRONT", i);
        intent.putExtra("BRING_TAB_TO_FRONT_SOURCE", i2);
        AbstractC2281Ro1.a(intent);
        return intent;
    }

    public static void y(Context context, Intent intent, String str) {
        if (context == null) {
            context = V60.a;
        }
        Intent intent2 = new Intent(intent);
        if (str != null) {
            intent2.setComponent(new ComponentName(context.getPackageName(), str));
        }
        AbstractC2281Ro1.a(intent2);
        context.startActivity(intent2);
    }

    public C1761No1(ChromeActivity chromeActivity, InterfaceC1631Mo1 interfaceC1631Mo1) {
        this.a = interfaceC1631Mo1;
        this.b = chromeActivity;
    }

    public static int r(String str) {
        if (str.equals("com.google.android.apps.plus")) {
            return 3;
        }
        if (str.equals("com.google.android.gm")) {
            return 1;
        }
        if (str.equals("com.google.android.talk")) {
            return 6;
        }
        if (str.equals("com.google.android.apps.messaging")) {
            return 7;
        }
        if (str.equals("jp.naver.line.android")) {
            return 9;
        }
        if (str.equals("com.whatsapp")) {
            return 10;
        }
        if (str.equals("com.google.android.googlequicksearchbox")) {
            return 11;
        }
        if (str.equals(V60.a.getPackageName())) {
            return 5;
        }
        if (str.startsWith("org.chromium.webapk")) {
            return 12;
        }
        if (str.equals("com.yahoo.mobile.client.android.mail")) {
            return 13;
        }
        return str.equals("com.viber.voip") ? 14 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0200, code lost:            if (r1.equals("mht") == false) goto L745;     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01da, code lost:            if ((r11.equals("multipart/related") || r11.equals("message/rfc822")) != false) goto L744;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(final android.content.Intent r17) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1761No1.u(android.content.Intent):boolean");
    }

    public final void v(LoadUrlParams loadUrlParams, int i, String str, int i2, Intent intent) {
        this.a.d(loadUrlParams, i, str, i2, intent);
        int c2 = c(intent);
        if (c2 != 5) {
            EI2.h(c2, 16, "MobileIntent.PageLoadDueToExternalApp");
        }
        ArrayList v = AbstractC2281Ro1.v(intent, "org.chromium.chrome.browser.eenp");
        if (v == null || v.size() <= 0) {
            return;
        }
        FI2.a("MobileExternalNavigationReceived");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e2, code lost:            if (defpackage.A84.a().contains(r8 + "," + r3 + ",1," + r5) != false) goto L272;     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String g(android.content.Intent r8) {
        /*
            java.lang.String r0 = "android.intent.extra.REFERRER"
            android.os.Parcelable r0 = defpackage.AbstractC2281Ro1.s(r8, r0)
            android.net.Uri r0 = (android.net.Uri) r0
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L34
            java.lang.String r3 = "org.chromium.chrome.browser.referrer_id"
            int r3 = defpackage.AbstractC2281Ro1.p(r1, r8, r3)
            android.util.Pair r4 = defpackage.C1761No1.c
            if (r4 == 0) goto L27
            java.lang.Object r4 = r4.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 != r3) goto L27
            android.util.Pair r3 = defpackage.C1761No1.c
            java.lang.Object r3 = r3.second
            java.lang.String r3 = (java.lang.String) r3
            goto L28
        L27:
            r3 = r2
        L28:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L2f
            goto L42
        L2f:
            android.net.Uri r0 = android.net.Uri.parse(r3)
            goto L42
        L34:
            java.lang.String r0 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r0 = defpackage.AbstractC2281Ro1.w(r8, r0)
            if (r0 == 0) goto L41
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L42
        L41:
            r0 = r2
        L42:
            androidx.browser.customtabs.CustomTabsSessionToken r3 = androidx.browser.customtabs.CustomTabsSessionToken.b(r8)
            if (r0 != 0) goto L5c
            if (r3 == 0) goto L5c
            org.chromium.chrome.browser.customtabs.CustomTabsConnection r4 = org.chromium.chrome.browser.customtabs.CustomTabsConnection.g()
            EU r4 = r4.c
            aL2 r4 = r4.c(r3)
            if (r4 == 0) goto L5c
            java.lang.String r0 = r4.a
            android.net.Uri r0 = android.net.Uri.parse(r0)
        L5c:
            if (r0 != 0) goto L5f
            return r2
        L5f:
            boolean r4 = q(r0)
            if (r4 == 0) goto L6a
            java.lang.String r8 = r0.toString()
            return r8
        L6a:
            boolean r8 = t(r8)
            if (r8 != 0) goto Lec
            zf0 r8 = defpackage.C10712vM.e()
            tE2 r8 = r8.q
            java.lang.Object r8 = r8.get()
            H43 r8 = (defpackage.H43) r8
            Zd0 r8 = r8.a(r3)
            if (r8 == 0) goto Le8
            PC r3 = r8.a
            androidx.browser.customtabs.CustomTabsSessionToken r3 = r3.u()
            org.chromium.chrome.browser.customtabs.CustomTabsConnection r8 = r8.k
            java.lang.String r8 = r8.e(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            r4 = 1
            if (r3 == 0) goto L96
            goto L9c
        L96:
            Je2 r3 = defpackage.C1193Je2.a(r0)
            if (r3 != 0) goto L9e
        L9c:
            r8 = r1
            goto Le5
        L9e:
            android.content.Context r5 = defpackage.V60.a
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.util.ArrayList r5 = defpackage.AbstractC4983eg2.b(r5, r8)
            if (r5 != 0) goto Lac
            r5 = r2
            goto Lb2
        Lac:
            java.lang.Object r5 = r5.get(r1)
            java.lang.String r5 = (java.lang.String) r5
        Lb2:
            java.util.Set r6 = defpackage.A84.b
            java.lang.String r7 = defpackage.A84.b(r8, r3, r4)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto Le4
            java.util.HashSet r6 = defpackage.A84.a()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r8)
            java.lang.String r8 = ","
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = ",1,"
            r7.append(r8)
            r7.append(r5)
            java.lang.String r8 = r7.toString()
            boolean r8 = r6.contains(r8)
            if (r8 == 0) goto L9c
        Le4:
            r8 = r4
        Le5:
            if (r8 == 0) goto Le8
            r1 = r4
        Le8:
            if (r1 == 0) goto Leb
            goto Lec
        Leb:
            return r2
        Lec:
            java.lang.String r8 = r0.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1761No1.g(android.content.Intent):java.lang.String");
    }

    public static String h(Intent intent) {
        String g2 = g(intent);
        if (g2 != null) {
            return g2;
        }
        Bundle k = AbstractC2281Ro1.k(intent, "com.android.browser.headers");
        if (k == null) {
            return null;
        }
        for (String str : k.keySet()) {
            String string = k.getString(str);
            if (string != null && "referer".equals(str.toLowerCase(Locale.US))) {
                Uri normalizeScheme = Uri.parse(string).normalizeScheme();
                if (q(normalizeScheme)) {
                    return normalizeScheme.toString();
                }
            }
        }
        return null;
    }

    public static boolean q(Uri uri) {
        if (uri == null) {
            return false;
        }
        Uri normalizeScheme = uri.normalizeScheme();
        return TextUtils.equals(normalizeScheme.getScheme(), "android-app") && !TextUtils.isEmpty(normalizeScheme.getHost());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String d(android.content.Intent r7) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r7.getAction()
            java.lang.String r2 = "android.speech.action.VOICE_SEARCH_RESULTS"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L12
            goto L95
        L12:
            java.lang.String r1 = "android.speech.extras.VOICE_SEARCH_RESULT_STRINGS"
            java.util.ArrayList r2 = defpackage.AbstractC2281Ro1.v(r7, r1)
            if (r2 != 0) goto L2c
            boolean r3 = defpackage.C1761No1.f
            if (r3 == 0) goto L2c
            java.lang.String r1 = defpackage.AbstractC2281Ro1.w(r7, r1)
            if (r1 == 0) goto L2c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r1)
        L2c:
            if (r2 == 0) goto L95
            int r1 = r2.size()
            if (r1 == 0) goto L95
            org.chromium.content.browser.BrowserStartupControllerImpl r1 = defpackage.RC.a()
            boolean r1 = r1.e()
            if (r1 != 0) goto L3f
            goto L95
        L3f:
            r1 = 0
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            org.chromium.chrome.browser.profiles.Profile r3 = org.chromium.chrome.browser.profiles.Profile.d()
            if (r3 != 0) goto L4e
            r3 = r0
            goto L54
        L4e:
            java.lang.Object r3 = J.N.MDwR4hsq(r3)
            org.chromium.chrome.browser.omnibox.suggestions.AutocompleteController r3 = (org.chromium.chrome.browser.omnibox.suggestions.AutocompleteController) r3
        L54:
            long r3 = r3.b
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L5e
            r3 = r0
            goto L64
        L5e:
            java.lang.Object r3 = J.N.MDxZMia5(r3, r2, r1)
            org.chromium.components.omnibox.AutocompleteMatch r3 = (org.chromium.components.omnibox.AutocompleteMatch) r3
        L64:
            boolean r4 = r3.c
            if (r4 != 0) goto L6f
            org.chromium.url.GURL r1 = r3.j
            java.lang.String r1 = r1.i()
            goto L96
        L6f:
            java.lang.String r3 = "android.speech.extras.VOICE_SEARCH_RESULT_URLS"
            java.util.ArrayList r3 = defpackage.AbstractC2281Ro1.v(r7, r3)
            if (r3 == 0) goto L84
            int r4 = r3.size()
            if (r4 <= 0) goto L84
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L96
        L84:
            org.chromium.components.search_engines.TemplateUrlService r1 = defpackage.IG3.a()
            long r3 = r1.c
            java.lang.Object r1 = J.N.MA0BGHUQ(r3, r1, r2)
            org.chromium.url.GURL r1 = (org.chromium.url.GURL) r1
            java.lang.String r1 = r1.i()
            goto L96
        L95:
            r1 = r0
        L96:
            if (r1 != 0) goto Lb5
            android.net.Uri r1 = r7.getData()
            if (r1 != 0) goto L9f
            goto Lb4
        L9f:
            android.net.Uri r1 = r7.getData()
            java.lang.String r2 = r1.getScheme()
            java.lang.String r3 = "customtab"
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto Lb4
            java.lang.String r1 = r1.getQuery()
            goto Lb5
        Lb4:
            r1 = r0
        Lb5:
            if (r1 != 0) goto Ld6
            android.net.Uri r1 = r7.getData()
            if (r1 != 0) goto Lbe
            goto Ld5
        Lbe:
            android.net.Uri r1 = r7.getData()
            java.lang.String r1 = r1.getScheme()
            java.lang.String r2 = "webapp"
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto Ld5
            java.lang.String r1 = "org.chromium.chrome.browser.webapp_url"
            java.lang.String r1 = defpackage.AbstractC2281Ro1.w(r7, r1)
            goto Ld6
        Ld5:
            r1 = r0
        Ld6:
            if (r1 != 0) goto Ldc
            java.lang.String r1 = r7.getDataString()
        Ldc:
            if (r1 != 0) goto Ldf
            return r0
        Ldf:
            java.lang.String r7 = r1.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 == 0) goto Lea
            goto Leb
        Lea:
            r0 = r7
        Leb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1761No1.d(android.content.Intent):java.lang.String");
    }

    public static void w(Map map, Intent intent) {
        if (map == null || map.isEmpty()) {
            intent.removeExtra("com.android.browser.headers");
            return;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        intent.putExtra("com.android.browser.headers", bundle);
    }

    public static String f(Intent intent) {
        C1193Je2 a;
        Bundle k = AbstractC2281Ro1.k(intent, "com.android.browser.headers");
        if (k == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean h = AbstractC2281Ro1.h(intent);
        CustomTabsConnection g2 = CustomTabsConnection.g();
        g2.getClass();
        CustomTabsSessionToken b = CustomTabsSessionToken.b(intent);
        boolean d2 = (b == null || (a = C1193Je2.a(intent.getData())) == null) ? false : g2.c.d(b, a);
        for (String str : k.keySet()) {
            String string = k.getString(str);
            if (!N.MorcXgQd(str, string)) {
                AbstractC4851eH1.f("IntentHandler", AbstractC4199cO1.a("Ignoring forbidden header ", str, " in EXTRA_HEADERS."), new Object[0]);
            }
            Locale locale = Locale.US;
            if (!"x-chrome-intent-type".equals(str.toLowerCase(locale))) {
                if (!h) {
                    if (!str.toLowerCase(locale).startsWith("x-chrome-")) {
                        if (!d2 && !N.MUs5WTJu(str, string)) {
                            AbstractC4851eH1.f("IntentHandler", AbstractC4199cO1.a("Ignoring non-CORS-safelisted header ", str, " in EXTRA_HEADERS."), new Object[0]);
                        }
                    } else {
                        AbstractC4851eH1.f("IntentHandler", AbstractC4199cO1.a("Ignoring x-chrome header ", str, " in EXTRA_HEADERS."), new Object[0]);
                    }
                }
                if (sb.length() != 0) {
                    sb.append("\n");
                }
                sb.append(str);
                sb.append(": ");
                sb.append(string);
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    public static long k(Intent intent) {
        return intent.getLongExtra("org.chromium.chrome.browser.timestamp", -1L);
    }

    public static boolean p(Intent intent, String str, String str2) {
        if (str != null && (intent.hasCategory("android.intent.category.BROWSABLE") || intent.hasCategory("android.intent.category.DEFAULT") || intent.getCategories() == null)) {
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            if ("chrome".equals(lowerCase) || "chrome-native".equals(lowerCase) || "about".equals(lowerCase)) {
                String lowerCase2 = str2.toLowerCase(locale);
                if (!"about:blank".equals(lowerCase2) && !"about://blank".equals(lowerCase2) && !"chrome://dino".equals(lowerCase2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b1, code lost:            if (p(r8, r9, r4) == false) goto L419;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:            defpackage.AbstractC4851eH1.f("IntentHandler", "Ignoring internal Chrome URL from untrustworthy source.", new java.lang.Object[0]);     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bc, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bd, code lost:            return false;     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[Catch: all -> 0x0119, TryCatch #0 {all -> 0x0119, blocks: (B:3:0x0001, B:8:0x0020, B:14:0x0054, B:16:0x005e, B:18:0x0066, B:20:0x006a, B:23:0x0075, B:25:0x007b, B:30:0x008c, B:33:0x0099, B:37:0x00a2, B:39:0x00ad, B:41:0x00b3, B:45:0x00c0, B:52:0x0101, B:55:0x0107, B:56:0x0110, B:58:0x0114, B:61:0x00d2, B:67:0x00ec, B:68:0x00d9, B:73:0x002a, B:75:0x0030, B:77:0x003e, B:84:0x0009, B:86:0x0013), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0101 A[Catch: all -> 0x0119, TryCatch #0 {all -> 0x0119, blocks: (B:3:0x0001, B:8:0x0020, B:14:0x0054, B:16:0x005e, B:18:0x0066, B:20:0x006a, B:23:0x0075, B:25:0x007b, B:30:0x008c, B:33:0x0099, B:37:0x00a2, B:39:0x00ad, B:41:0x00b3, B:45:0x00c0, B:52:0x0101, B:55:0x0107, B:56:0x0110, B:58:0x0114, B:61:0x00d2, B:67:0x00ec, B:68:0x00d9, B:73:0x002a, B:75:0x0030, B:77:0x003e, B:84:0x0009, B:86:0x0013), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ec A[Catch: all -> 0x0119, TryCatch #0 {all -> 0x0119, blocks: (B:3:0x0001, B:8:0x0020, B:14:0x0054, B:16:0x005e, B:18:0x0066, B:20:0x006a, B:23:0x0075, B:25:0x007b, B:30:0x008c, B:33:0x0099, B:37:0x00a2, B:39:0x00ad, B:41:0x00b3, B:45:0x00c0, B:52:0x0101, B:55:0x0107, B:56:0x0110, B:58:0x0114, B:61:0x00d2, B:67:0x00ec, B:68:0x00d9, B:73:0x002a, B:75:0x0030, B:77:0x003e, B:84:0x0009, B:86:0x0013), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x002a A[Catch: all -> 0x0119, TryCatch #0 {all -> 0x0119, blocks: (B:3:0x0001, B:8:0x0020, B:14:0x0054, B:16:0x005e, B:18:0x0066, B:20:0x006a, B:23:0x0075, B:25:0x007b, B:30:0x008c, B:33:0x0099, B:37:0x00a2, B:39:0x00ad, B:41:0x00b3, B:45:0x00c0, B:52:0x0101, B:55:0x0107, B:56:0x0110, B:58:0x0114, B:61:0x00d2, B:67:0x00ec, B:68:0x00d9, B:73:0x002a, B:75:0x0030, B:77:0x003e, B:84:0x0009, B:86:0x0013), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x(android.content.Intent r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1761No1.x(android.content.Intent, boolean):boolean");
    }

    public static int c(Intent intent) {
        if (AbstractC2281Ro1.h(intent)) {
            return 5;
        }
        String w = AbstractC2281Ro1.w(intent, "com.android.browser.application_id");
        if (w == null) {
            String n = n(intent);
            String g2 = g(intent);
            if (n != null && n.startsWith("http://t.co/")) {
                return 4;
            }
            if (!"android-app://m.facebook.com".equals(g2)) {
                if (n != null && n.startsWith("http://news.google.com/news/url?")) {
                    return 8;
                }
                if (n != null && (n.startsWith("https://www.youtube.com/redirect?") || n.startsWith("http://www.youtube.com/redirect?"))) {
                    return 15;
                }
                Bundle k = AbstractC2281Ro1.k(intent, "com.android.browser.headers");
                if (k == null || !"http://m.facebook.com".equals(k.get("Referer"))) {
                    return 0;
                }
            }
            return 2;
        }
        return r(w);
    }

    public static int e(Intent intent) {
        if (AbstractC2281Ro1.h(intent)) {
            return AbstractC2281Ro1.p(-1, intent, "BRING_TAB_TO_FRONT");
        }
        return -1;
    }

    public static int j(Intent intent) {
        if (AbstractC2281Ro1.h(intent)) {
            return AbstractC2281Ro1.p(-1, intent, "com.android.chrome.tab_id");
        }
        return -1;
    }

    public static boolean t(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (AbstractC2281Ro1.h(intent)) {
            return true;
        }
        PendingIntent pendingIntent = (PendingIntent) AbstractC2281Ro1.s(intent, "trusted_application_code_extra");
        return pendingIntent != null && C4502dG0.b.g(pendingIntent.getCreatorPackage());
    }

    public static String i(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(":")) < 0) {
            return null;
        }
        boolean z = false;
        String trim = str.substring(0, indexOf).toLowerCase(Locale.US).trim();
        int i = 0;
        while (true) {
            if (i >= trim.length()) {
                break;
            }
            char charAt = trim.charAt(i);
            if (!Character.isLetterOrDigit(charAt) && charAt != '-' && charAt != '+' && charAt != '.') {
                z = true;
                break;
            }
            i++;
        }
        return z ? trim.replaceAll("[^a-z0-9.+-]", "") : trim;
    }

    public static String n(Intent intent) {
        String scheme;
        String d2 = d(intent);
        boolean z = false;
        if (d2 != null && (scheme = Uri.parse(d2).getScheme()) != null && scheme.equals("googlechrome")) {
            z = true;
        }
        return z ? m(d2) : d2;
    }

    public static String s(Intent intent, String str, String str2) {
        String type;
        if (intent == null || str == null || !TextUtils.equals(i(str), "content") || (type = intent.getType()) == null || type.isEmpty()) {
            return str2;
        }
        if (!(type.equals("multipart/related") || type.equals("message/rfc822"))) {
            return str2;
        }
        String concat = "X-Chrome-intent-type: ".concat(type);
        return str2 == null ? concat : AbstractC8192o0.a(str2, "\n", concat);
    }

    public static String m(String str) {
        if (!str.toLowerCase(Locale.US).startsWith("googlechrome://navigate?url=")) {
            return null;
        }
        String substring = str.substring(28);
        if (!TextUtils.isEmpty(substring) && i(substring) == null) {
            substring = AbstractC4809e90.a("http://", substring);
        }
        Pattern pattern = T34.a;
        if (T34.l(Uri.parse(substring).getScheme())) {
            return substring;
        }
        return null;
    }

    public static int l(Intent intent, int i) {
        if (intent == null) {
            return i;
        }
        int p = AbstractC2281Ro1.p(0, intent, "com.google.chrome.transition_type");
        return p == 1 ? p : (p == 0 || !t(intent)) ? i : p;
    }

    public static Intent b(Context context, boolean z) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse("chrome-native://newtab/"));
        intent.setClass(context, ChromeLauncherActivity.class);
        intent.putExtra("create_new_tab", true);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        intent.putExtra("com.google.android.apps.chrome.EXTRA_OPEN_NEW_INCOGNITO_TAB", z);
        AbstractC2281Ro1.a(intent);
        return intent;
    }

    public static boolean o(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return AbstractC2281Ro1.i(bundle, "org.chromium.chrome.browser.incognito_mode", false) || AbstractC2281Ro1.i(bundle, "com.google.android.apps.chrome.EXTRA_OPEN_NEW_INCOGNITO_TAB", false) || AbstractC2281Ro1.i(bundle, "org.chromium.chrome.browser.incognito.invoked_from_launch_new_incognito_tab", false);
    }
}
