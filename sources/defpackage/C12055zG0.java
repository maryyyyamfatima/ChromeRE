package defpackage;

import J.N;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.TransactionTooLargeException;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.view.WindowManager;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;
import org.chromium.url.Origin;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zG0 */
/* loaded from: classes2.dex */
public final class C12055zG0 {
    public static final String[] b = {"com.google.android.instantapps.START", "com.google.android.instantapps.nmr1.INSTALL", "com.google.android.instantapps.nmr1.VIEW"};
    public final InterfaceC5189fG0 a;

    public static boolean q(Intent intent) {
        Context context = V60.a;
        ResolveInfo c = AbstractC3017Xf2.c(intent, 65536);
        if (c == null) {
            return false;
        }
        String packageName = context.getPackageName();
        if (c.match != 0) {
            return true;
        }
        List b2 = AbstractC3017Xf2.b(intent, 65536);
        if (b2 == null || b2.isEmpty()) {
            return false;
        }
        Iterator it = b2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            String str = resolveInfo.activityInfo.packageName;
            if (!packageName.equals(str) && "com.google.android.apps.docs".equals(str) && k(intent)) {
                intent.setClassName(str, resolveInfo.activityInfo.name);
                intent.putExtra("android.intent.extra.REFERRER", new Uri.Builder().scheme("android-app").authority(packageName).build());
                break;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0022, code lost:            if (r0.c == false) goto L140;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:            if (r0.c == false) goto L140;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:            r0 = true;     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean h(defpackage.BG0 r5) {
        /*
            VK2 r0 = r5.g
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L7
            goto L26
        L7:
            boolean r3 = defpackage.VK2.a()
            if (r3 == 0) goto L1a
            UK2 r0 = r0.c
            SK2 r3 = r0.h
            boolean r3 = r3.f
            if (r3 == 0) goto L26
            boolean r0 = r0.c
            if (r0 != 0) goto L26
            goto L24
        L1a:
            UK2 r0 = r0.c
            int r3 = r0.a
            if (r3 != r1) goto L26
            boolean r0 = r0.c
            if (r0 != 0) goto L26
        L24:
            r0 = r1
            goto L27
        L26:
            r0 = r2
        L27:
            int r3 = r5.d
            r4 = 134217728(0x8000000, float:3.85186E-34)
            r3 = r3 & r4
            if (r3 == 0) goto L30
            r3 = r1
            goto L31
        L30:
            r3 = r2
        L31:
            if (r3 == 0) goto L37
            boolean r5 = r5.e
            if (r5 != 0) goto L3b
        L37:
            if (r0 == 0) goto L3a
            goto L3b
        L3a:
            r1 = r2
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12055zG0.h(BG0):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(defpackage.BG0 r4, boolean r5) {
        /*
            r3 = this;
            boolean r0 = r4.k
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Lc
            boolean r0 = r4.m
            if (r0 != 0) goto Lc
            r0 = r1
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 != 0) goto L49
            if (r5 == 0) goto L13
        L11:
            r0 = r2
            goto L2a
        L13:
            boolean r0 = r4.f
            if (r0 == 0) goto L11
            fG0 r0 = r3.a
            hG0 r0 = (defpackage.C5877hG0) r0
            r0.getClass()
            int r0 = org.chromium.base.ApplicationStatus.getStateForApplication()
            if (r0 != r1) goto L26
            r0 = r1
            goto L27
        L26:
            r0 = r2
        L27:
            if (r0 != 0) goto L11
            r0 = r1
        L2a:
            if (r0 != 0) goto L49
            if (r5 == 0) goto L30
        L2e:
            r5 = r2
            goto L39
        L30:
            boolean r5 = r4.i
            if (r5 == 0) goto L2e
            boolean r5 = r4.j
            if (r5 != 0) goto L2e
            r5 = r1
        L39:
            if (r5 != 0) goto L49
            int r4 = r4.d
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            r4 = r4 & r5
            if (r4 == 0) goto L44
            r4 = r1
            goto L45
        L44:
            r4 = r2
        L45:
            if (r4 == 0) goto L48
            goto L49
        L48:
            r1 = r2
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12055zG0.u(BG0, boolean):boolean");
    }

    public final boolean f(C11026wG0 c11026wG0, BG0 bg0) {
        String str = bg0.l;
        if (str == null) {
            return false;
        }
        Iterator it = c(c11026wG0, bg0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
            if (activityInfo != null && str.equals(activityInfo.packageName)) {
                return true;
            }
        }
        return false;
    }

    public final List c(C11026wG0 c11026wG0, BG0 bg0) {
        if ((bg0.d & 134217728) != 0) {
            ((C5877hG0) this.a).getClass();
            if (Build.VERSION.SDK_INT >= 31 && UN.X.a()) {
                return (List) c11026wG0.h.get();
            }
        }
        return (List) c11026wG0.get();
    }

    public C12055zG0(C5877hG0 c5877hG0) {
        this.a = c5877hG0;
    }

    public final C9654sG0 v(BG0 bg0) {
        Intent parseUri;
        Intent intent;
        GURL gurl = bg0.a;
        boolean z = false;
        if (T34.d(gurl)) {
            try {
                parseUri = Intent.parseUri(gurl.i(), 1);
            } catch (Exception e) {
                AbstractC4851eH1.f("UrlHandler", "Bad URI %s", gurl.i(), e);
                return C9654sG0.b();
            }
        } else {
            if (!gurl.i().startsWith("wtai://wp/mc;")) {
                intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(gurl.i()));
            } else {
                String substring = gurl.i().substring(13);
                FI2.a("Android.PhoneIntent");
                intent = new Intent("android.intent.action.VIEW", Uri.parse("tel:" + substring));
            }
            parseUri = intent;
        }
        GURL gurl2 = new GURL(AbstractC2281Ro1.w(parseUri, "browser_fallback_url"));
        if (!gurl2.b || !T34.l(gurl2.h())) {
            gurl2 = GURL.emptyGURL();
        }
        parseUri.removeExtra("browser_fallback_url");
        C9311rG0 c9311rG0 = new C9311rG0();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C9654sG0 w = w(bg0, parseUri, gurl2, c9311rG0);
        EI2.n(SystemClock.elapsedRealtime() - elapsedRealtime, "Android.StrictMode.OverrideUrlLoadingTime");
        if (w.a != 3) {
            if (((bg0.d & 255) == 7) && bg0.e) {
                z = true;
            }
            if (!z) {
                return w;
            }
            EI2.b("Android.Intent.LaunchExternalAppFormSubmitHasUserGesture", bg0.m);
            return w;
        }
        return e(parseUri, bg0, gurl2, c9311rG0.a.booleanValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:            if (r3.d != false) goto L362;     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0063 A[Catch: Exception -> 0x0068, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0068, blocks: (B:37:0x0037, B:39:0x004d, B:43:0x0063, B:46:0x0055, B:48:0x005d), top: B:36:0x0037 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C9654sG0 e(android.content.Intent r6, defpackage.BG0 r7, org.chromium.url.GURL r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12055zG0.e(android.content.Intent, BG0, org.chromium.url.GURL, boolean):sG0");
    }

    public static boolean r(List list, List list2) {
        if (list2 == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
            hashSet.add(new ComponentName(activityInfo.packageName, activityInfo.name));
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ActivityInfo activityInfo2 = ((ResolveInfo) it2.next()).activityInfo;
            if (!hashSet.contains(new ComponentName(activityInfo2.packageName, activityInfo2.name))) {
                return false;
            }
        }
        return true;
    }

    public final C9654sG0 a(GURL gurl, GURL gurl2, Origin origin, boolean z) {
        LoadUrlParams loadUrlParams = new LoadUrlParams(gurl.i(), 0);
        if (!gurl2.k()) {
            loadUrlParams.e = new C3498aL2(gurl2.i(), 0);
        }
        if (VK2.a()) {
            loadUrlParams.n = z;
            loadUrlParams.b = origin;
        }
        PostTask.c(AbstractC5103f04.a, new RunnableC6907kG0(this, loadUrlParams));
        return new C9654sG0(1);
    }

    public static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals("about") || str.equals("chrome") || str.equals("chrome-native") || str.equals("devtools");
    }

    public final boolean A(Intent intent, BG0 bg0, GURL gurl, boolean z) {
        InterfaceC5189fG0 interfaceC5189fG0 = this.a;
        C5877hG0 c5877hG0 = (C5877hG0) interfaceC5189fG0;
        Context g = c5877hG0.g();
        if (!(c5877hG0.i() && V60.a(g) != null)) {
            return false;
        }
        interfaceC5189fG0.getClass();
        try {
            C5490g8 c5490g8 = new C5490g8(g, R.style.f105200_resource_name_obfuscated_res_0x7f150545);
            c5490g8.i(R.string.0_resource_name_obfuscated_res_0x7f140487);
            c5490g8.b(R.string.0_resource_name_obfuscated_res_0x7f140486);
            c5490g8.f(R.string.0_resource_name_obfuscated_res_0x7f140484, new DialogInterfaceOnClickListenerC7939nG0(this, bg0, intent, gurl, z));
            c5490g8.e(R.string.0_resource_name_obfuscated_res_0x7f140485, new DialogInterfaceOnClickListenerC7595mG0(this, bg0, intent, gurl, z));
            c5490g8.a.l = new DialogInterfaceOnCancelListenerC7251lG0(this, bg0, intent, gurl, z);
            c5490g8.k();
            return true;
        } catch (WindowManager.BadTokenException unused) {
            return false;
        }
    }

    public final void n(boolean z, BG0 bg0, Intent intent, GURL gurl, boolean z2) {
        Callback callback;
        Callback callback2;
        if (z) {
            try {
                y(intent, z2);
                if (!bg0.k || (callback = bg0.n) == null) {
                    return;
                }
                Tab tab = ((C5877hG0) this.a).a;
                callback.onResult(new AG0((tab == null || tab.p() || !tab.isInitialized()) ? false : true, false));
                return;
            } catch (ActivityNotFoundException unused) {
            }
        }
        C9654sG0 e = e(intent, bg0, gurl, false);
        if (!bg0.k || (callback2 = bg0.n) == null) {
            return;
        }
        if (e.a == 3) {
            callback2.onResult(new AG0(false, false));
        } else {
            callback2.onResult(new AG0(false, true));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:331:0x0759, code lost:            if (defpackage.O83.a.e("applink.chrome_default_browser", false) != false) goto L3929;     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0595, code lost:            if ((defpackage.VK2.a() ? r14.c.h.d : r14.c.a == 2) != false) goto L3818;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0a9f  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0acf  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0ad4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0bbc  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0bbe  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0bd0  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0bd5  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:681:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d4  */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v61 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C9654sG0 w(defpackage.BG0 r28, android.content.Intent r29, org.chromium.url.GURL r30, defpackage.C9311rG0 r31) {
        /*
            Method dump skipped, instructions count: 3068
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12055zG0.w(BG0, android.content.Intent, org.chromium.url.GURL, rG0):sG0");
    }

    public static void s(Intent intent) {
        intent.setFlags(intent.getFlags() & 1007171600);
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setComponent(null);
        intent.setSelector(null);
    }

    public final C9654sG0 t(String str, String str2, BG0 bg0, GURL gurl) {
        Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", str).appendQueryParameter("referrer", Uri.decode(str2)).build());
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setPackage("com.android.vending");
        intent.addFlags(268435456);
        if (!bg0.c.k()) {
            intent.putExtra("android.intent.extra.REFERRER", Uri.parse(bg0.c.i()));
        }
        List p = p(intent);
        if (!((p == null || p.isEmpty()) ? false : true)) {
            return C9654sG0.b();
        }
        if (bg0.b) {
            if (A(intent, bg0, gurl, false)) {
                return new C9654sG0(2);
            }
            return C9654sG0.b();
        }
        y(intent, false);
        return C9654sG0.a();
    }

    public final String o(C11026wG0 c11026wG0, BG0 bg0) {
        List c = c(c11026wG0, bg0);
        this.a.getClass();
        ArrayList d = d(null, c, true);
        if (d.size() == 1) {
            String str = (String) d.get(0);
            byte[] bArr = SR.a;
            byte[] bArr2 = SR.b;
            if (AbstractC3641al4.a == null) {
                AbstractC3641al4.a = bArr;
            }
            if (AbstractC3641al4.b == null) {
                AbstractC3641al4.b = bArr2;
            }
            if (AbstractC3641al4.c(V60.a, str) != 0) {
                return (String) d.get(0);
            }
        }
        return null;
    }

    public static List p(Intent intent) {
        return AbstractC3017Xf2.b(intent, 65600);
    }

    public static boolean k(Intent intent) {
        if (intent == null || intent.getData() == null) {
            return false;
        }
        String lastPathSegment = intent.getData().getLastPathSegment();
        return (lastPathSegment != null && lastPathSegment.endsWith(".pdf")) || "application/pdf".equals(intent.getType());
    }

    public final void y(Intent intent, boolean z) {
        x(intent, z, false, null, null, null, null, null, null, false);
    }

    public final C9654sG0 x(Intent intent, boolean z, boolean z2, C11026wG0 c11026wG0, C11712yG0 c11712yG0, GURL gurl, GURL gurl2, GURL gurl3, Origin origin, boolean z3) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            if (intent != null) {
                try {
                    try {
                        try {
                            if (k(intent)) {
                                q(intent);
                            }
                        } catch (RuntimeException e) {
                            ComponentName componentName = AbstractC2281Ro1.a;
                            if (!(e.getCause() instanceof TransactionTooLargeException)) {
                                throw e;
                            }
                            AbstractC4851eH1.a("IntentUtils", "Could not resolve Activity for intent " + intent.toString(), e);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return C9654sG0.b();
                        }
                    } catch (AndroidRuntimeException e2) {
                        AbstractC4851eH1.a("UrlHandler", "Could not start Activity for intent " + intent.toString(), e2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return C9654sG0.b();
                    }
                } catch (ActivityNotFoundException | SecurityException unused) {
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return C9654sG0.b();
                }
            }
            InterfaceC5189fG0 interfaceC5189fG0 = this.a;
            if (z) {
                ((C5877hG0) interfaceC5189fG0).e(intent);
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("org.chromium.chrome.browser.eenp");
                if (stringArrayListExtra != null && stringArrayListExtra.size() > 0) {
                    FI2.a("MobileExternalNavigationDispatched");
                }
                return C9654sG0.a();
            }
            Context a = V60.a(((C5877hG0) interfaceC5189fG0).g());
            if (a == null) {
                a = V60.a;
                intent.addFlags(268435456);
            }
            Context context = a;
            if (z2) {
                return z(intent, c11026wG0, c11712yG0, gurl, gurl2, gurl3, context, origin, z3);
            }
            context.startActivity(intent);
            ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("org.chromium.chrome.browser.eenp");
            if (stringArrayListExtra2 != null && stringArrayListExtra2.size() > 0) {
                FI2.a("MobileExternalNavigationDispatched");
            }
            return C9654sG0.a();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    public final C9654sG0 z(Intent intent, C11026wG0 c11026wG0, C11712yG0 c11712yG0, GURL gurl, GURL gurl2, GURL gurl3, Context context, Origin origin, boolean z) {
        String str;
        ApplicationInfo applicationInfo;
        ResolveInfo resolveInfo = (ResolveInfo) c11712yG0.get();
        if (resolveInfo == null) {
            return C9654sG0.b();
        }
        if (!r(Arrays.asList(resolveInfo), (List) c11026wG0.get())) {
            context.startActivity(intent);
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("org.chromium.chrome.browser.eenp");
            if (stringArrayListExtra != null && stringArrayListExtra.size() > 0) {
                FI2.a("MobileExternalNavigationDispatched");
            }
            return C9654sG0.a();
        }
        Intent intent2 = new Intent("android.intent.action.PICK_ACTIVITY");
        intent2.putExtra("android.intent.extra.INTENT", intent);
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String packageName = context.getPackageName();
        Intent.ShortcutIconResource shortcutIconResource = new Intent.ShortcutIconResource();
        try {
            applicationInfo = packageManager.getApplicationInfo(packageName, 128);
            str = (String) packageManager.getApplicationLabel(applicationInfo);
        } catch (PackageManager.NameNotFoundException | Resources.NotFoundException unused) {
            str = "";
        }
        try {
            Resources resourcesForApplication = packageManager.getResourcesForApplication(applicationInfo);
            shortcutIconResource.packageName = packageName;
            String resourceName = resourcesForApplication.getResourceName(applicationInfo.icon);
            shortcutIconResource.resourceName = resourceName;
            resourcesForApplication.getDrawable(resourcesForApplication.getIdentifier(resourceName, null, null), null);
        } catch (PackageManager.NameNotFoundException | Resources.NotFoundException unused2) {
            AbstractC4851eH1.f("UrlHandler", AbstractC4809e90.a("No icon resource found for package: ", packageName), new Object[0]);
            shortcutIconResource.packageName = "";
            shortcutIconResource.resourceName = "";
            arrayList2.add(str);
            arrayList.add(shortcutIconResource);
            intent2.putExtra("android.intent.extra.shortcut.NAME", arrayList2);
            intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", arrayList);
            ((C5877hG0) this.a).h().z(intent2, new C8283oG0(this, gurl2, gurl3, origin, z, gurl, intent), null);
            return new C9654sG0(2);
        }
        arrayList2.add(str);
        arrayList.add(shortcutIconResource);
        intent2.putExtra("android.intent.extra.shortcut.NAME", arrayList2);
        intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", arrayList);
        ((C5877hG0) this.a).h().z(intent2, new C8283oG0(this, gurl2, gurl3, origin, z, gurl, intent), null);
        return new C9654sG0(2);
    }

    public final C9654sG0 m(final Intent intent, C11026wG0 c11026wG0, C11712yG0 c11712yG0, GURL gurl) {
        if (!gurl.k()) {
            return C9654sG0.b();
        }
        ResolveInfo resolveInfo = (ResolveInfo) c11712yG0.get();
        if (resolveInfo == null || resolveInfo.activityInfo == null) {
            return C9654sG0.b();
        }
        if (!r(Arrays.asList(resolveInfo), (List) c11026wG0.get())) {
            return C9654sG0.b();
        }
        C5877hG0 c5877hG0 = (C5877hG0) this.a;
        InterfaceC4578dV1 a = AbstractC5609gV1.a(c5877hG0.h());
        Tab tab = c5877hG0.a;
        WebContents b2 = tab == null ? null : tab.b();
        if (a == null || b2 == null) {
            return C9654sG0.b();
        }
        String str = resolveInfo.activityInfo.packageName;
        PackageManager packageManager = c5877hG0.g().getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            Drawable applicationLogo = packageManager.getApplicationLogo(applicationInfo);
            if (applicationLogo == null) {
                applicationLogo = packageManager.getApplicationIcon(applicationInfo);
            }
            CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
            Resources resources = c5877hG0.g().getResources();
            String string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f14048b, applicationLabel);
            String string2 = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f14048a, applicationLabel);
            String string3 = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140489);
            BD2 bd2 = new BD2(HU1.F);
            bd2.c(HU1.a, 31);
            bd2.e(HU1.f, string);
            bd2.e(HU1.h, string2);
            bd2.e(HU1.l, applicationLogo);
            bd2.e(HU1.c, string3);
            bd2.c(HU1.p, 0);
            bd2.e(HU1.d, new InterfaceC0079Ap3() { // from class: iG0
                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    this.y(intent, false);
                    return 1;
                }
            });
            ((C5265fV1) a).b(bd2.a(), b2, 2, false);
            return new C9654sG0(2);
        } catch (PackageManager.NameNotFoundException unused) {
            return C9654sG0.b();
        }
    }

    public static ArrayList d(String str, List list, boolean z) {
        boolean z2;
        ActivityInfo activityInfo;
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            IntentFilter intentFilter = resolveInfo.filter;
            boolean z3 = false;
            if (intentFilter != null && (intentFilter.countDataAuthorities() != 0 || intentFilter.countDataPaths() != 0)) {
                Iterator<IntentFilter.AuthorityEntry> authoritiesIterator = intentFilter.authoritiesIterator();
                while (authoritiesIterator != null && authoritiesIterator.hasNext()) {
                    if ("*".equals(authoritiesIterator.next().getHost())) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
                if (!z2 && (TextUtils.isEmpty(str) || ((activityInfo = resolveInfo.activityInfo) != null && activityInfo.packageName.equals(str)))) {
                    z3 = true;
                }
            }
            if (z3) {
                if (resolveInfo.activityInfo != null) {
                    if (!z || !AbstractC2281Ro1.f(resolveInfo)) {
                        arrayList.add(resolveInfo.activityInfo.packageName);
                    }
                } else {
                    arrayList.add("");
                }
            }
        }
        return arrayList;
    }

    public final GURL b() {
        C5877hG0 c5877hG0 = (C5877hG0) this.a;
        Tab tab = c5877hG0.a;
        if ((tab == null ? null : tab.b()) == null) {
            return null;
        }
        Tab tab2 = c5877hG0.a;
        return (tab2 != null ? tab2.b() : null).f();
    }

    public final boolean l() {
        GURL b2 = b();
        if (b2 == null || b2.k()) {
            return false;
        }
        return N.M$l72hrq(b2.i());
    }

    public static boolean i(Intent intent) {
        if ("com.google.android.instantapps.supervisor".equals(intent.getPackage())) {
            return true;
        }
        String action = intent.getAction();
        String[] strArr = b;
        for (int i = 0; i < 3; i++) {
            if (strArr[i].equals(action)) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(BG0 bg0) {
        if (N.MRiRQ_Ey(N.MWCIEpVs(0))) {
            VK2 vk2 = bg0.g;
            if (vk2 == null || !vk2.c.c) {
                return false;
            }
            Object[] objArr = new Object[3];
            Origin origin = bg0.p;
            objArr[0] = origin.a();
            C1063Ie2 c1063Ie2 = origin.a;
            C4422d14 c4422d14 = c1063Ie2.e;
            objArr[1] = !(c4422d14 != null) ? c1063Ie2.c : "";
            objArr[2] = Integer.valueOf(c4422d14 != null ? (short) 0 : c1063Ie2.d);
            return N.Mn0fHwI$(String.format("%s://%s:%s", objArr));
        }
        GURL b2 = b();
        if (b2 == null || b2.k()) {
            return false;
        }
        return N.Mn0fHwI$(b2.i());
    }
}
