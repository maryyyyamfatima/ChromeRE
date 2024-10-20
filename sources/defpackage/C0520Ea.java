package defpackage;

import J.N;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.chromium.base.ThreadUtils;
import org.chromium.components.payments.PaymentManifestParser;
import org.chromium.components.payments.PaymentManifestWebDataService;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ea */
/* loaded from: classes2.dex */
public final class C0520Ea implements InterfaceC6069hp2 {
    public final HashSet a = new HashSet();
    public final C5381fp2 b;
    public final PaymentManifestWebDataService c;
    public final PaymentManifestParser d;
    public final C2757Vf2 e;
    public final InterfaceC6749jo2 f;
    public final InterfaceC7093ko2 g;
    public final boolean h;
    public final HashMap i;
    public final HashMap j;
    public final HashMap k;
    public final HashMap l;
    public final HashMap m;
    public final HashMap n;
    public int o;
    public int p;
    public int q;

    public C0520Ea(PaymentManifestWebDataService paymentManifestWebDataService, C5381fp2 c5381fp2, PaymentManifestParser paymentManifestParser, C2757Vf2 c2757Vf2, C7781mo2 c7781mo2, InterfaceC7093ko2 interfaceC7093ko2) {
        HashMap hashMap = new HashMap();
        this.i = hashMap;
        this.j = new HashMap();
        this.k = new HashMap();
        this.l = new HashMap();
        this.m = new HashMap();
        this.n = new HashMap();
        this.f = c7781mo2;
        hashMap.put("com.android.vending", new GURL("https://play.google.com/billing"));
        for (GURL gurl : hashMap.values()) {
        }
        this.b = c5381fp2;
        this.c = paymentManifestWebDataService;
        this.d = paymentManifestParser;
        this.e = c2757Vf2;
        this.g = interfaceC7093ko2;
        this.h = ((C2287Rp2) this.f.e()).m;
    }

    public final HashSet b(ActivityInfo activityInfo) {
        HashSet hashSet = new HashSet();
        String[] a = a(activityInfo, "org.chromium.payment_method_names");
        if (a == null) {
            return hashSet;
        }
        for (String str : a) {
            GURL gurl = new GURL(str);
            if (S34.a(gurl)) {
                str = g(gurl);
            }
            hashSet.add(str);
        }
        return hashSet;
    }

    public final String[] a(ActivityInfo activityInfo, String str) {
        int i;
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (i = bundle.getInt(str)) == 0) {
            return null;
        }
        ApplicationInfo applicationInfo = activityInfo.applicationInfo;
        this.e.getClass();
        try {
            Resources resourcesForApplication = V60.a.getPackageManager().getResourcesForApplication(applicationInfo);
            if (resourcesForApplication == null) {
                return null;
            }
            return resourcesForApplication.getStringArray(i);
        } catch (PackageManager.NameNotFoundException | Resources.NotFoundException unused) {
            return null;
        }
    }

    public final void e() {
        int i = this.o - 1;
        this.o = i;
        if (i != 0) {
            return;
        }
        HashMap hashMap = this.m;
        for (Map.Entry entry : hashMap.entrySet()) {
            GURL gurl = (GURL) entry.getKey();
            if (this.a.contains(gurl)) {
                C0390Da c0390Da = (C0390Da) entry.getValue();
                String g = g(gurl);
                Iterator it = c0390Da.a.iterator();
                while (it.hasNext()) {
                    f((ResolveInfo) it.next(), g);
                }
                Iterator it2 = c0390Da.b.iterator();
                while (it2.hasNext()) {
                    Set set = (Set) this.k.get((GURL) it2.next());
                    if (set != null) {
                        Iterator it3 = set.iterator();
                        while (it3.hasNext()) {
                            C0390Da c0390Da2 = (C0390Da) hashMap.get((GURL) it3.next());
                            if (c0390Da2 != null) {
                                Iterator it4 = c0390Da2.a.iterator();
                                while (it4.hasNext()) {
                                    f((ResolveInfo) it4.next(), g);
                                }
                            }
                        }
                    }
                }
            }
        }
        c();
    }

    public final void c() {
        HashMap hashMap = this.j;
        boolean z = hashMap.size() > 0;
        InterfaceC6749jo2 interfaceC6749jo2 = this.f;
        interfaceC6749jo2.b(z);
        if (hashMap.isEmpty() || ((C2287Rp2) interfaceC6749jo2.e()).u) {
            interfaceC6749jo2.d(this.g);
            return;
        }
        this.p = hashMap.size();
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            C0000Aa c0000Aa = (C0000Aa) ((Map.Entry) it.next()).getValue();
            C4317ck k = ((C2287Rp2) interfaceC6749jo2.e()).k();
            Set<String> o = c0000Aa.o();
            HashMap hashMap2 = new HashMap();
            for (String str : o) {
                if (k.containsKey(str)) {
                    hashMap2.put(str, (C6755jp2) k.get(str));
                }
            }
            String str2 = ((C2287Rp2) interfaceC6749jo2.e()).h;
            String str3 = ((C2287Rp2) interfaceC6749jo2.e()).i;
            byte[][] bArr = ((C2287Rp2) interfaceC6749jo2.e()).l;
            Map unmodifiableMap = Collections.unmodifiableMap(((C2287Rp2) interfaceC6749jo2.e()).t.b());
            Set<String> o2 = c0000Aa.o();
            HashMap hashMap3 = new HashMap();
            for (String str4 : o2) {
                if (unmodifiableMap.containsKey(str4)) {
                    hashMap3.put(str4, (C11212wo2) unmodifiableMap.get(str4));
                }
            }
            C0260Ca c0260Ca = new C0260Ca(this);
            Object obj = ThreadUtils.a;
            c0000Aa.w = c0260Ca;
            String str5 = c0000Aa.v;
            if (str5 == null) {
                c0000Aa.G(true);
            } else {
                String MR6Af3ZS = N.MR6Af3ZS(str2, 1);
                String MR6Af3ZS2 = N.MR6Af3ZS(str3, 1);
                HashMap hashMap4 = new HashMap();
                for (Map.Entry entry : hashMap2.entrySet()) {
                    String str6 = (String) entry.getKey();
                    C6755jp2 c6755jp2 = (C6755jp2) entry.getValue();
                    hashMap4.put(str6, c6755jp2 == null ? null : new C5027en4(c6755jp2.b, c6755jp2.c));
                }
                boolean M1X7xdZV = N.M1X7xdZV("IdentityInCanMakePaymentEventFeature");
                Intent intent = new Intent();
                AbstractC3653an4.c(str5, "serviceName");
                String str7 = c0000Aa.t;
                AbstractC3653an4.c(str7, "packageName");
                intent.setClassName(str7, str5);
                Bundle bundle = new Bundle();
                if (M1X7xdZV) {
                    AbstractC3653an4.a(MR6Af3ZS, MR6Af3ZS2, bArr, hashMap4, bundle);
                }
                intent.putExtras(bundle);
                final ServiceConnectionC9520rs1 serviceConnectionC9520rs1 = new ServiceConnectionC9520rs1(V60.a, intent, c0000Aa);
                try {
                    serviceConnectionC9520rs1.h = serviceConnectionC9520rs1.a.bindService(serviceConnectionC9520rs1.k, serviceConnectionC9520rs1, 1);
                } catch (SecurityException unused) {
                }
                if (!serviceConnectionC9520rs1.h) {
                    serviceConnectionC9520rs1.a();
                } else {
                    serviceConnectionC9520rs1.j.postDelayed(new Runnable() { // from class: os1
                        @Override // java.lang.Runnable
                        public final void run() {
                            ServiceConnectionC9520rs1 serviceConnectionC9520rs12 = ServiceConnectionC9520rs1.this;
                            if (serviceConnectionC9520rs12.i) {
                                return;
                            }
                            serviceConnectionC9520rs12.a();
                        }
                    }, 1000L);
                }
            }
        }
    }

    public final void f(ResolveInfo resolveInfo, String str) {
        C2418Sp3 c2418Sp3;
        InterfaceC6749jo2 interfaceC6749jo2 = this.f;
        if (((C2287Rp2) interfaceC6749jo2.e()).u) {
            return;
        }
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        String str2 = activityInfo.packageName;
        String[] a = a(activityInfo, "org.chromium.payment_supported_delegations");
        if (a == null || a.length == 0) {
            c2418Sp3 = new C2418Sp3();
        } else {
            int min = Math.min(a.length, 4);
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            for (int i = 0; i < min; i++) {
                String str3 = a[i];
                if (str3 == null) {
                    AbstractC4851eH1.a("SupportedDelegations", "null is an invalid delegation value. Only [\"shippingAddress\", \"payerName\", \"payerPhone\", \"payerEmail\"] values are possible.", new Object[0]);
                } else if (str3.equals("shippingAddress")) {
                    z = true;
                } else if (a[i].equals("payerName")) {
                    z2 = true;
                } else if (a[i].equals("payerPhone")) {
                    z3 = true;
                } else if (a[i].equals("payerEmail")) {
                    z4 = true;
                } else {
                    AbstractC4851eH1.a("SupportedDelegations", "\"%s\" is an invalid delegation value. Only [\"shippingAddress\", \"payerName\", \"payerPhone\", \"payerEmail\"] values are possible.", a[i]);
                }
            }
            c2418Sp3 = new C2418Sp3(z, z2, z3, z4);
        }
        C2418Sp3 c2418Sp32 = c2418Sp3;
        if (N.M1X7xdZV("EnforceFullDelegation") || str.equals("https://play.google.com/billing")) {
            C7787mp2 c7787mp2 = ((C2287Rp2) interfaceC6749jo2.e()).n;
            if (!(c7787mp2 == null || ((!c7787mp2.e || c2418Sp32.a) && ((!c7787mp2.b || c2418Sp32.b) && ((!c7787mp2.d || c2418Sp32.c) && (!c7787mp2.c || c2418Sp32.d)))))) {
                AbstractC4851eH1.a("PaymentAppFinder", "Skipping $ for not providing all of the requested PaymentOptions.".replace("$", str2), new Object[0]);
                return;
            }
        }
        HashMap hashMap = this.j;
        C0000Aa c0000Aa = (C0000Aa) hashMap.get(str2);
        if (c0000Aa == null) {
            this.e.getClass();
            CharSequence loadLabel = resolveInfo.loadLabel(V60.a.getPackageManager());
            if (TextUtils.isEmpty(loadLabel)) {
                AbstractC4851eH1.a("PaymentAppFinder", "Skipping \"%s\" because of empty label.", str2);
                return;
            }
            Bundle bundle = resolveInfo.activityInfo.metaData;
            C0000Aa c0000Aa2 = new C0000Aa(new C12154za(((C2287Rp2) interfaceC6749jo2.e()).f), str2, resolveInfo.activityInfo.name, (String) this.n.get(str2), loadLabel.toString(), resolveInfo.loadIcon(V60.a.getPackageManager()), this.h, bundle == null ? null : bundle.getString("org.chromium.default_payment_method_name"), c2418Sp32);
            hashMap.put(str2, c0000Aa2);
            c0000Aa = c0000Aa2;
        }
        c0000Aa.r.add(str);
    }

    public final void d() {
        int i = this.q - 1;
        this.q = i;
        if (i != 0) {
            return;
        }
        PaymentManifestWebDataService paymentManifestWebDataService = this.c;
        long j = paymentManifestWebDataService.a;
        if (j != 0) {
            N.M0aw7fcV(j, paymentManifestWebDataService);
            paymentManifestWebDataService.a = 0L;
        }
        C5381fp2 c5381fp2 = this.b;
        c5381fp2.getClass();
        Object obj = ThreadUtils.a;
        long j2 = c5381fp2.a;
        if (j2 != 0) {
            N.MJUrxDH$(j2, c5381fp2);
            c5381fp2.a = 0L;
        }
        PaymentManifestParser paymentManifestParser = this.d;
        paymentManifestParser.getClass();
        long j3 = paymentManifestParser.a;
        if (j3 != 0) {
            N.MFuu4tOD(j3);
            paymentManifestParser.a = 0L;
        }
    }

    public static String g(GURL gurl) {
        String i;
        if (gurl == null || (i = gurl.i()) == null) {
            return null;
        }
        if (i.endsWith("/")) {
            i = i.substring(0, i.length() - 1);
        }
        return i;
    }
}
