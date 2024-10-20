package defpackage;

import J.N;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsSessionToken;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.ArrayList;
import java.util.Arrays;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.content_public.browser.NavigationEntry;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ON extends CustomTabsConnection {
    public static final String[] n;
    public static final String[] o = {"com.google.android.googlequicksearchbox", "com.google.android.apps.searchlite", "com.google.android.gm"};
    public static final String[] p;
    public static final String[] q;
    public static final String[] r;
    public static final String[] s;
    public static final String[] t;
    public static final String[] u;
    public static final String[] v;
    public static final String[] w;
    public final C4511dI l = new C4511dI(V60.a.getPackageManager());
    public final C4502dG0 m;

    @Override // org.chromium.chrome.browser.customtabs.CustomTabsConnection
    public final String h() {
        return "com.google.android.googlequicksearchbox";
    }

    static {
        String[] strArr = {"com.google.android.googlequicksearchbox", "com.google.android.apps.searchlite"};
        n = strArr;
        String[] strArr2 = {"com.google.android.googlequicksearchbox", "com.google.android.apps.genie.geniewidget", "com.google.android.apps.searchlite"};
        String[] strArr3 = {"com.google.android.googlequicksearchbox", "com.google.android.apps.searchlite", "com.google.android.gm", "com.google.android.youtube"};
        p = strArr3;
        q = strArr3;
        r = strArr2;
        s = strArr2;
        t = strArr;
        u = strArr;
        v = strArr;
        w = strArr;
    }

    public ON(C4502dG0 c4502dG0) {
        this.m = c4502dG0;
    }

    public static Bundle C() {
        Bundle bundle = new Bundle();
        bundle.putInt("version", 5195);
        return bundle;
    }

    @Override // org.chromium.chrome.browser.customtabs.CustomTabsConnection
    public final boolean o(CustomTabsSessionToken customTabsSessionToken) {
        boolean o2 = super.o(customTabsSessionToken);
        int callingUid = Binder.getCallingUid();
        if (o2 && E(callingUid, p)) {
            EU eu = this.c;
            synchronized (eu) {
                DU du = (DU) eu.c.get(customTabsSessionToken);
                if (du != null) {
                    du.u = true;
                }
            }
        }
        return o2;
    }

    @Override // org.chromium.chrome.browser.customtabs.CustomTabsConnection
    public final Uri z(int i, CustomTabsSessionToken customTabsSessionToken, C1193Je2 c1193Je2) {
        if (!F(i) || customTabsSessionToken == null) {
            return super.z(i, customTabsSessionToken, c1193Je2);
        }
        return Uri.parse("android-app://www.google.com/" + e(customTabsSessionToken));
    }

    @Override // org.chromium.chrome.browser.customtabs.CustomTabsConnection
    public final void y(Intent intent) {
        boolean z;
        String w2;
        PendingIntent pendingIntent = (PendingIntent) AbstractC2281Ro1.s(intent, "com.android.chrome.extra.GSA_ACCOUNT_NAME_PENDING_INTENT");
        if (pendingIntent == null) {
            return;
        }
        String creatorPackage = pendingIntent.getCreatorPackage();
        String[] strArr = w;
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = false;
                break;
            } else {
                if (strArr[i].equals(creatorPackage)) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        if (z && (w2 = AbstractC2281Ro1.w(intent, "com.android.chrome.extra.GSA_ACCOUNT_NAME")) != null) {
            C1202Jg1 a = C1202Jg1.a();
            Profile d = Profile.d();
            a.getClass();
            String b = CoreAccountInfo.b(C1202Jg1.b(d).b(1));
            if (TextUtils.isEmpty(b) || b.equals(w2)) {
                return;
            }
            SharedPreferences sharedPreferences = T60.a;
            String string = sharedPreferences.getString("com.android.chrome.SHOWN_ACCOUNT_NAME_IN_TOAST", "");
            if (TextUtils.isEmpty(string) || !string.equals(b)) {
                String w3 = AbstractC2281Ro1.w(intent, "com.android.chrome.extra.ACCOUNT_MISMATCH_TOAST_MESSAGE");
                if (TextUtils.isEmpty(w3)) {
                    return;
                }
                ZN3.c(V60.a, w3.replace("%s", b), 0).d();
                sharedPreferences.edit().putString("com.android.chrome.SHOWN_ACCOUNT_NAME_IN_TOAST", b).apply();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:            if ("com.google.android.googlequicksearchbox".equals(r4) == false) goto L10;     */
    @Override // org.chromium.chrome.browser.customtabs.CustomTabsConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(android.os.Bundle r4, boolean r5) {
        /*
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            if (r4 == 0) goto La
            r0.putExtras(r4)
        La:
            java.lang.String r4 = "com.android.chrome.extra.GSA_ACCOUNT_NAME_PENDING_INTENT"
            android.os.Parcelable r4 = defpackage.AbstractC2281Ro1.s(r0, r4)
            android.app.PendingIntent r4 = (android.app.PendingIntent) r4
            java.lang.String r1 = "com.google.android.googlequicksearchbox"
            if (r4 != 0) goto L17
            goto L21
        L17:
            java.lang.String r4 = r4.getCreatorPackage()
            boolean r2 = r1.equals(r4)
            if (r2 != 0) goto L22
        L21:
            r4 = 0
        L22:
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L29
            return
        L29:
            androidx.browser.customtabs.CustomTabsSessionToken r4 = androidx.browser.customtabs.CustomTabsSessionToken.b(r0)
            if (r4 != 0) goto L30
            return
        L30:
            if (r5 == 0) goto L44
            QF3 r5 = defpackage.AbstractC5103f04.a
            KN r0 = new KN
            r0.<init>()
            java.lang.Object r5 = org.chromium.base.task.PostTask.e(r5, r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L45
        L44:
            r5 = 0
        L45:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "freResult"
            r0.putInt(r1, r5)
            df0 r4 = r4.c     // Catch: java.lang.Exception -> L56
            java.lang.String r5 = "onFirstRunChanged"
            r4.a(r5, r0)     // Catch: java.lang.Exception -> L56
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ON.u(android.os.Bundle, boolean):void");
    }

    @Override // org.chromium.chrome.browser.customtabs.CustomTabsConnection
    public final Bundle f(CustomTabsSessionToken customTabsSessionToken) {
        C3265Zd0 a;
        NavigationEntry w2;
        Bundle f = super.f(customTabsSessionToken);
        if (!"com.google.android.googlequicksearchbox".equals(e(customTabsSessionToken)) || (a = this.b.a(customTabsSessionToken)) == null) {
            return f;
        }
        C4620dd0 c4620dd0 = a.g;
        Tab tab = c4620dd0.b;
        String str = null;
        String i = tab == null ? null : tab.getUrl().i();
        if (!TextUtils.isEmpty(i)) {
            f.putParcelable("urlInfo", Uri.parse(i));
        }
        Tab tab2 = c4620dd0.b;
        if (tab2 != null && tab2.b() != null && (w2 = tab2.b().i().w()) != null) {
            str = w2.b.i();
        }
        if (str != null) {
            f.putParcelable("pendingUrl", Uri.parse(str));
        }
        return f;
    }

    public final boolean F(int i) {
        if (i == Process.myUid()) {
            return true;
        }
        for (String str : V60.a.getApplicationContext().getPackageManager().getPackagesForUid(i)) {
            if (this.m.g(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean E(int i, String[] strArr) {
        boolean z;
        if (i == Process.myUid()) {
            return true;
        }
        for (String str : V60.a.getApplicationContext().getPackageManager().getPackagesForUid(i)) {
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                }
                if (strArr[i2].equals(str)) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0115. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03c5 A[Catch: all -> 0x0403, TRY_LEAVE, TryCatch #2 {all -> 0x0403, blocks: (B:3:0x0007, B:10:0x0019, B:12:0x0023, B:14:0x002f, B:15:0x0037, B:18:0x004a, B:19:0x0061, B:22:0x0115, B:24:0x03c1, B:26:0x03c5, B:30:0x011a, B:32:0x0124, B:33:0x012f, B:34:0x014e, B:36:0x0154, B:38:0x012a, B:39:0x016a, B:42:0x0174, B:45:0x017e, B:48:0x018a, B:51:0x01a1, B:53:0x01bb, B:56:0x01c5, B:58:0x01d2, B:59:0x01ec, B:60:0x01e2, B:61:0x01f2, B:64:0x01fc, B:66:0x0208, B:69:0x0214, B:71:0x021b, B:73:0x0222, B:76:0x022c, B:77:0x023c, B:80:0x0246, B:84:0x0270, B:86:0x0257, B:89:0x0260, B:91:0x0268, B:92:0x0274, B:95:0x027e, B:96:0x0284, B:97:0x0290, B:101:0x029b, B:103:0x02a0, B:107:0x02a4, B:108:0x02a5, B:109:0x02a6, B:112:0x02b8, B:113:0x02c0, B:116:0x02ca, B:117:0x02d0, B:121:0x02db, B:123:0x02de, B:127:0x02e2, B:128:0x02e3, B:129:0x02e4, B:132:0x02ee, B:133:0x02f4, B:137:0x02ff, B:139:0x0304, B:143:0x0308, B:144:0x0309, B:145:0x030a, B:148:0x0314, B:149:0x0320, B:153:0x032b, B:155:0x0332, B:159:0x0336, B:160:0x0337, B:161:0x0338, B:164:0x0342, B:165:0x034e, B:169:0x0359, B:171:0x035d, B:175:0x0360, B:176:0x0361, B:177:0x0362, B:180:0x036f, B:182:0x0381, B:184:0x038c, B:185:0x0390, B:188:0x039d, B:189:0x03a4, B:190:0x0385, B:192:0x03a5, B:195:0x03b3, B:197:0x03b7, B:198:0x0066, B:201:0x0071, B:204:0x007d, B:207:0x0089, B:210:0x0094, B:213:0x00a0, B:216:0x00ab, B:219:0x00b6, B:222:0x00c1, B:225:0x00cb, B:228:0x00d5, B:231:0x00df, B:234:0x00ea, B:237:0x00f4, B:240:0x00fe, B:243:0x0109, B:246:0x003c, B:248:0x0044, B:250:0x0048, B:119:0x02d1, B:99:0x0291, B:102:0x029e, B:151:0x0321, B:154:0x032e, B:135:0x02f5, B:138:0x0302, B:167:0x034f, B:170:0x035b), top: B:2:0x0007, inners: #0, #1, #3, #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021b A[Catch: all -> 0x0403, TryCatch #2 {all -> 0x0403, blocks: (B:3:0x0007, B:10:0x0019, B:12:0x0023, B:14:0x002f, B:15:0x0037, B:18:0x004a, B:19:0x0061, B:22:0x0115, B:24:0x03c1, B:26:0x03c5, B:30:0x011a, B:32:0x0124, B:33:0x012f, B:34:0x014e, B:36:0x0154, B:38:0x012a, B:39:0x016a, B:42:0x0174, B:45:0x017e, B:48:0x018a, B:51:0x01a1, B:53:0x01bb, B:56:0x01c5, B:58:0x01d2, B:59:0x01ec, B:60:0x01e2, B:61:0x01f2, B:64:0x01fc, B:66:0x0208, B:69:0x0214, B:71:0x021b, B:73:0x0222, B:76:0x022c, B:77:0x023c, B:80:0x0246, B:84:0x0270, B:86:0x0257, B:89:0x0260, B:91:0x0268, B:92:0x0274, B:95:0x027e, B:96:0x0284, B:97:0x0290, B:101:0x029b, B:103:0x02a0, B:107:0x02a4, B:108:0x02a5, B:109:0x02a6, B:112:0x02b8, B:113:0x02c0, B:116:0x02ca, B:117:0x02d0, B:121:0x02db, B:123:0x02de, B:127:0x02e2, B:128:0x02e3, B:129:0x02e4, B:132:0x02ee, B:133:0x02f4, B:137:0x02ff, B:139:0x0304, B:143:0x0308, B:144:0x0309, B:145:0x030a, B:148:0x0314, B:149:0x0320, B:153:0x032b, B:155:0x0332, B:159:0x0336, B:160:0x0337, B:161:0x0338, B:164:0x0342, B:165:0x034e, B:169:0x0359, B:171:0x035d, B:175:0x0360, B:176:0x0361, B:177:0x0362, B:180:0x036f, B:182:0x0381, B:184:0x038c, B:185:0x0390, B:188:0x039d, B:189:0x03a4, B:190:0x0385, B:192:0x03a5, B:195:0x03b3, B:197:0x03b7, B:198:0x0066, B:201:0x0071, B:204:0x007d, B:207:0x0089, B:210:0x0094, B:213:0x00a0, B:216:0x00ab, B:219:0x00b6, B:222:0x00c1, B:225:0x00cb, B:228:0x00d5, B:231:0x00df, B:234:0x00ea, B:237:0x00f4, B:240:0x00fe, B:243:0x0109, B:246:0x003c, B:248:0x0044, B:250:0x0048, B:119:0x02d1, B:99:0x0291, B:102:0x029e, B:151:0x0321, B:154:0x032e, B:135:0x02f5, B:138:0x0302, B:167:0x034f, B:170:0x035b), top: B:2:0x0007, inners: #0, #1, #3, #4, #8 }] */
    /* JADX WARN: Type inference failed for: r1v22, types: [JN] */
    @Override // org.chromium.chrome.browser.customtabs.CustomTabsConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle d(java.lang.String r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ON.d(java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [MN] */
    @Override // org.chromium.chrome.browser.customtabs.CustomTabsConnection
    public final void v(final CustomTabsSessionToken customTabsSessionToken, String str, String str2, final Uri uri) {
        TraceEvent i = TraceEvent.i("ChromeCustomTabsConnection.sendNavigationInfo", null);
        if (customTabsSessionToken == null) {
            if (i != null) {
                i.close();
                return;
            }
            return;
        }
        try {
            if (!"com.google.android.googlequicksearchbox".equals(e(customTabsSessionToken))) {
                if (i != null) {
                    i.close();
                    return;
                }
                return;
            }
            final Bundle bundle = new Bundle();
            bundle.putParcelable("urlInfo", Uri.parse(str));
            bundle.putString("titleInfo", str2);
            final Context context = V60.a;
            final SharedPreferences sharedPreferences = T60.a;
            final String string = sharedPreferences.getString("CustomTabs.LastSentUri", null);
            sharedPreferences.edit().remove("CustomTabs.LastSentUri").apply();
            final ?? r0 = new Runnable() { // from class: MN
                @Override // java.lang.Runnable
                public final void run() {
                    CustomTabsSessionToken customTabsSessionToken2 = customTabsSessionToken;
                    Uri uri2 = uri;
                    Bundle bundle2 = bundle;
                    if (uri2 != null) {
                        sharedPreferences.edit().putString("CustomTabs.LastSentUri", uri2.toString()).apply();
                        context.grantUriPermission("com.google.android.googlequicksearchbox", uri2, 1);
                        bundle2.putParcelable("bitmapUri", uri2);
                    }
                    try {
                        customTabsSessionToken2.c.a("onNavigationInfoReady", bundle2);
                    } catch (Exception unused) {
                    }
                }
            };
            if (string != null) {
                AbstractC0185Bl.e.execute(new Runnable() { // from class: NN
                    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:            if (r2.delete() != false) goto L10;     */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            r3 = this;
                            java.lang.String r0 = r3
                            android.net.Uri r1 = android.net.Uri.parse(r0)
                            java.lang.String r1 = r1.getScheme()
                            java.lang.String r2 = "content"
                            boolean r1 = r2.equals(r1)
                            if (r1 == 0) goto L21
                            android.content.Context r1 = r1
                            android.content.ContentResolver r1 = r1.getContentResolver()
                            android.net.Uri r0 = android.net.Uri.parse(r0)
                            r2 = 0
                            r1.delete(r0, r2, r2)
                            goto L41
                        L21:
                            r1 = 0
                            java.io.File r2 = new java.io.File     // Catch: java.lang.IllegalArgumentException -> L35
                            r2.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L35
                            boolean r0 = r2.exists()     // Catch: java.lang.IllegalArgumentException -> L35
                            if (r0 == 0) goto L33
                            boolean r0 = r2.delete()     // Catch: java.lang.IllegalArgumentException -> L35
                            if (r0 == 0) goto L35
                        L33:
                            r0 = 1
                            goto L36
                        L35:
                            r0 = r1
                        L36:
                            if (r0 != 0) goto L41
                            java.lang.Object[] r0 = new java.lang.Object[r1]
                            java.lang.String r1 = "CustomTabs"
                            java.lang.String r2 = "File delete error."
                            defpackage.AbstractC4851eH1.a(r1, r2, r0)
                        L41:
                            java.lang.Runnable r0 = r2
                            r0.run()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.NN.run():void");
                    }
                });
            } else {
                r0.run();
            }
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public static Bundle D(String str) {
        String[] strArr;
        String[] strArr2;
        Bundle C = C();
        if (str == null) {
            return C;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -657263593:
                if (str.equals("isGoogleDefaultSearchProvider")) {
                    c = 0;
                    break;
                }
                break;
            case -530971347:
                if (str.equals("setPrerenderOnCellularForSession")) {
                    c = 1;
                    break;
                }
                break;
            case -406566247:
                if (str.equals("isSWAAUser")) {
                    c = 2;
                    break;
                }
                break;
            case -156080615:
                if (str.equals("requestCurrentNavigationInfoForSession")) {
                    c = 3;
                    break;
                }
                break;
            case -127328683:
                if (str.equals("setHideDomainForSession")) {
                    c = 4;
                    break;
                }
                break;
            case 225698082:
                if (str.equals("getAccountName")) {
                    c = 5;
                    break;
                }
                break;
            case 709060135:
                if (str.equals("isFirstRunDone")) {
                    c = 6;
                    break;
                }
                break;
            case 958316053:
                if (str.equals("setIgnoreUrlFragmentsForSession")) {
                    c = 7;
                    break;
                }
                break;
            case 1320909521:
                if (str.equals("setSpeculationModeForSession")) {
                    c = '\b';
                    break;
                }
                break;
            case 1918671832:
                if (str.equals("requestBottomBarScrollStateForSession")) {
                    c = '\t';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                strArr = new String[]{"void", "session", IBinder.class.getName()};
                break;
            case 1:
                strArr2 = new String[]{"void", "session", IBinder.class.getName(), "prerender", "boolean"};
                strArr = strArr2;
                break;
            case 2:
                strArr = new String[]{"boolean"};
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                strArr = new String[]{"void", "session", IBinder.class.getName()};
                break;
            case 4:
                strArr2 = new String[]{"void", "session", IBinder.class.getName(), "hidden", "boolean"};
                strArr = strArr2;
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                strArr = new String[]{String.class.getName()};
                break;
            case 6:
                strArr = new String[]{"boolean"};
                break;
            case 7:
                strArr2 = new String[]{"void", "session", IBinder.class.getName(), "ignoreFragments", "boolean"};
                strArr = strArr2;
                break;
            case '\b':
                strArr = new String[]{"void", "session", IBinder.class.getName(), "deprecatedSpeculationMode", "int"};
                break;
            case '\t':
                strArr = new String[]{"void", "session", IBinder.class.getName()};
                break;
            default:
                strArr = null;
                break;
        }
        if (strArr == null) {
            return C;
        }
        C.putStringArrayList("getSignature", new ArrayList<>(Arrays.asList(strArr)));
        return C;
    }

    @Override // org.chromium.chrome.browser.customtabs.CustomTabsConnection
    public final void w(CustomTabsSessionToken customTabsSessionToken, WebContents webContents) {
        String str;
        EU eu = this.c;
        Integer num = -1;
        synchronized (eu) {
            DU du = (DU) eu.c.get(customTabsSessionToken);
            if (du != null) {
                num = Integer.valueOf(du.a);
            }
        }
        int intValue = num.intValue();
        if (intValue == -1) {
            return;
        }
        C4511dI c4511dI = this.l;
        c4511dI.b.getClass();
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("CCTClientDataHeader")) {
            PackageManager packageManager = c4511dI.a;
            String[] packagesForUid = packageManager.getPackagesForUid(intValue);
            int length = packagesForUid.length;
            for (int i = 0; i < length; i++) {
                String str2 = packagesForUid[i];
                if (str2.equals("com.google.android.googlequicksearchbox")) {
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(str2, 128);
                        if (packageInfo != null) {
                            int i2 = packageInfo.versionCode;
                            C7928nE c7928nE2 = UN.a;
                            if (i2 >= N.M37SqSAy("CCTClientDataHeader", "expected_version", 0)) {
                                str = N.MMltG$kc("CCTClientDataHeader", "header_value");
                                break;
                            }
                            continue;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        AbstractC4851eH1.a("CctHeaderValidator", "Couldn't get version of package.", e);
                    }
                }
            }
        }
        str = null;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str)) {
            return;
        }
        N.MLgTz0Wv(webContents, str);
    }
}
