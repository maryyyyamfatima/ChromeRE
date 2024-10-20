package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class tw4 {
    public static final C9187qt4 c = new C9187qt4("SplitInstallInfoProvider");
    public final Context a;
    public final String b;

    public tw4(Context context) {
        this.a = context;
        this.b = context.getPackageName();
    }

    public static boolean d(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public final HashSet a() {
        HashSet hashSet = new HashSet();
        Iterator it = e().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!d(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public final HashSet b() {
        Mv4 c2 = c();
        if (c2 == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        HashSet e = e();
        e.add("");
        HashSet a = a();
        a.add("");
        for (Map.Entry entry : c2.a(a).entrySet()) {
            if (e.containsAll((Collection) entry.getValue())) {
                hashSet.add((String) entry.getKey());
            }
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.Mv4 c() {
        /*
            r11 = this;
            android.os.Bundle r0 = r11.f()
            r1 = 0
            r2 = 5
            r3 = 0
            qt4 r4 = defpackage.tw4.c
            if (r0 != 0) goto L13
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r3 = "No metadata found in Context."
            r4.b(r2, r3, r0)
            return r1
        L13:
            java.lang.String r5 = "com.android.vending.splits"
            int r0 = r0.getInt(r5)
            if (r0 != 0) goto L23
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r3 = "No metadata found in AndroidManifest."
            r4.b(r2, r3, r0)
            return r1
        L23:
            android.content.Context r5 = r11.a     // Catch: android.content.res.Resources.NotFoundException -> Le1
            android.content.res.Resources r5 = r5.getResources()     // Catch: android.content.res.Resources.NotFoundException -> Le1
            android.content.res.XmlResourceParser r0 = r5.getXml(r0)     // Catch: android.content.res.Resources.NotFoundException -> Le1
            Gv4 r5 = new Gv4
            r5.<init>()
        L32:
            int r6 = r0.next()     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            r7 = 1
            if (r6 == r7) goto Lcb
            int r6 = r0.getEventType()     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            r7 = 2
            if (r6 != r7) goto L32
            java.lang.String r6 = r0.getName()     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            java.lang.String r8 = "splits"
            boolean r6 = r6.equals(r8)     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            if (r6 == 0) goto Lc6
        L4c:
            int r6 = r0.next()     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            r8 = 3
            if (r6 == r8) goto L32
            int r6 = r0.getEventType()     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            if (r6 != r7) goto L4c
            java.lang.String r6 = r0.getName()     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            java.lang.String r9 = "module"
            boolean r6 = r6.equals(r9)     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            if (r6 == 0) goto Lc2
            java.lang.String r6 = "name"
            java.lang.String r6 = defpackage.AbstractC5425fw4.a(r6, r0)     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            if (r6 == 0) goto Lc2
        L6d:
            int r9 = r0.next()     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            if (r9 == r8) goto L4c
            int r9 = r0.getEventType()     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            if (r9 != r7) goto L6d
            java.lang.String r9 = r0.getName()     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            java.lang.String r10 = "language"
            boolean r9 = r9.equals(r10)     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            if (r9 == 0) goto Lbe
        L85:
            int r9 = r0.next()     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            if (r9 == r8) goto L6d
            int r9 = r0.getEventType()     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            if (r9 != r7) goto L85
            java.lang.String r9 = r0.getName()     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            java.lang.String r10 = "entry"
            boolean r9 = r9.equals(r10)     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            if (r9 == 0) goto Lba
            java.lang.String r9 = "key"
            java.lang.String r9 = defpackage.AbstractC5425fw4.a(r9, r0)     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            java.lang.String r10 = "split"
            java.lang.String r10 = defpackage.AbstractC5425fw4.a(r10, r0)     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            defpackage.AbstractC5425fw4.b(r0)     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            if (r9 == 0) goto L85
            if (r10 == 0) goto L85
            r5.b(r6, r9, r10)     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            goto L85
        Lb4:
            r0 = move-exception
            goto Ld0
        Lb6:
            r0 = move-exception
            goto Ld0
        Lb8:
            r0 = move-exception
            goto Ld0
        Lba:
            defpackage.AbstractC5425fw4.b(r0)     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            goto L85
        Lbe:
            defpackage.AbstractC5425fw4.b(r0)     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            goto L6d
        Lc2:
            defpackage.AbstractC5425fw4.b(r0)     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            goto L4c
        Lc6:
            defpackage.AbstractC5425fw4.b(r0)     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            goto L32
        Lcb:
            Mv4 r1 = r5.a()     // Catch: java.lang.IllegalStateException -> Lb4 java.io.IOException -> Lb6 org.xmlpull.v1.XmlPullParserException -> Lb8
            goto Ld7
        Ld0:
            java.lang.String r5 = "SplitInstall"
            java.lang.String r6 = "Error while parsing splits.xml"
            android.util.Log.e(r5, r6, r0)
        Ld7:
            if (r1 != 0) goto Le0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r3 = "Can't parse languages metadata."
            r4.b(r2, r3, r0)
        Le0:
            return r1
        Le1:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r3 = "Resource with languages metadata doesn't exist."
            r4.b(r2, r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw4.c():Mv4");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.HashSet e() {
        /*
            r7 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            android.os.Bundle r1 = r7.f()
            qt4 r2 = defpackage.tw4.c
            r3 = 3
            r4 = 0
            if (r1 != 0) goto L10
            goto L3b
        L10:
            java.lang.String r5 = "com.android.dynamic.apk.fused.modules"
            java.lang.String r1 = r1.getString(r5)
            if (r1 == 0) goto L34
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L1f
            goto L34
        L1f:
            java.lang.String r5 = ","
            r6 = -1
            java.lang.String[] r1 = r1.split(r5, r6)
            java.util.Collections.addAll(r0, r1)
            java.lang.String r1 = ""
            r0.remove(r1)
            java.lang.String r1 = "base"
            r0.remove(r1)
            goto L3b
        L34:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r5 = "App has no fused modules."
            r2.b(r3, r5, r1)
        L3b:
            android.content.Context r1 = r7.a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            java.lang.String r5 = r7.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r5, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            if (r1 == 0) goto L54
            java.lang.String[] r1 = r1.splitNames     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            goto L55
        L4c:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r5 = 5
            java.lang.String r6 = "App is not found in PackageManager"
            r2.b(r5, r6, r1)
        L54:
            r1 = 0
        L55:
            if (r1 == 0) goto L69
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = java.util.Arrays.toString(r1)
            r5[r4] = r6
            java.lang.String r4 = "Adding splits from package manager: %s"
            r2.b(r3, r4, r5)
            java.util.Collections.addAll(r0, r1)
            goto L70
        L69:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r4 = "No splits are found or app cannot be found in package manager."
            r2.b(r3, r4, r1)
        L70:
            java.util.concurrent.atomic.AtomicReference r1 = defpackage.rw4.a
            java.lang.Object r1 = r1.get()
            jw4 r1 = (defpackage.C6799jw4) r1
            if (r1 == 0) goto L8e
            ph3 r1 = r1.a
            java.util.HashSet r2 = r1.b
            monitor-enter(r2)
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L8b
            java.util.HashSet r1 = r1.b     // Catch: java.lang.Throwable -> L8b
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8b
            r0.addAll(r3)
            goto L8e
        L8b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8b
            throw r0
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw4.e():java.util.HashSet");
    }

    public final Bundle f() {
        Bundle bundle;
        C9187qt4 c9187qt4 = c;
        try {
            ApplicationInfo applicationInfo = this.a.getPackageManager().getApplicationInfo(this.b, 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                return bundle;
            }
            c9187qt4.b(3, "App has no applicationInfo or metaData", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            c9187qt4.b(5, "App is not found in PackageManager", new Object[0]);
            return null;
        }
    }
}
