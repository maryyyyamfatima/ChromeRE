package defpackage;

import J.N;
import android.content.pm.ResolveInfo;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.chromium.base.ThreadUtils;
import org.chromium.components.payments.PaymentManifestDownloader$ManifestDownloadCallback;
import org.chromium.components.payments.PaymentManifestParser;
import org.chromium.components.payments.PaymentManifestWebDataService;
import org.chromium.components.payments.WebAppManifestSection;
import org.chromium.url.GURL;
import org.chromium.url.Origin;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ip2 */
/* loaded from: classes2.dex */
public final class C6412ip2 implements PaymentManifestDownloader$ManifestDownloadCallback, PaymentManifestParser.ManifestParseCallback, PaymentManifestWebDataService.PaymentManifestWebDataServiceCallback {
    public final Origin a;
    public final GURL b;
    public final Set d;
    public final PaymentManifestWebDataService g;
    public final C5381fp2 h;
    public final PaymentManifestParser i;
    public final C2757Vf2 j;
    public final InterfaceC6069hp2 k;
    public final MessageDigest l;
    public Origin m;
    public int n;
    public boolean o;
    public boolean p;
    public final HashMap c = new HashMap();
    public final HashSet e = new HashSet();
    public final ArrayList f = new ArrayList();

    public C6412ip2(Origin origin, GURL gurl, Set set, Set set2, PaymentManifestWebDataService paymentManifestWebDataService, C5381fp2 c5381fp2, PaymentManifestParser paymentManifestParser, C2757Vf2 c2757Vf2, C0520Ea c0520Ea) {
        MessageDigest messageDigest;
        this.a = origin;
        this.b = gurl;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ResolveInfo resolveInfo = (ResolveInfo) it.next();
                C5725gp2 c5725gp2 = new C5725gp2();
                c5725gp2.a = resolveInfo;
                this.c.put(resolveInfo.activityInfo.packageName, c5725gp2);
            }
        }
        this.d = Collections.unmodifiableSet(set2 == null ? new HashSet() : new HashSet(set2));
        this.h = c5381fp2;
        this.g = paymentManifestWebDataService;
        this.i = paymentManifestParser;
        this.j = c2757Vf2;
        this.k = c0520Ea;
        if (!this.c.isEmpty()) {
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
                AbstractC4851eH1.a("PaymentManifest", "Unable to generate SHA-256 hashes.", new Object[0]);
            }
            this.l = messageDigest;
        }
        messageDigest = null;
        this.l = messageDigest;
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        Formatter formatter = new Formatter(sb);
        for (byte b : bArr) {
            formatter.format("%02x", Byte.valueOf(b));
        }
        String sb2 = sb.toString();
        formatter.close();
        return sb2;
    }

    @Override // org.chromium.components.payments.PaymentManifestWebDataService.PaymentManifestWebDataServiceCallback
    public final void onPaymentMethodManifestFetched(String[] strArr) {
        InterfaceC6069hp2 interfaceC6069hp2;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int i = 0;
        while (true) {
            int length = strArr.length;
            Origin origin = this.a;
            C5381fp2 c5381fp2 = this.h;
            GURL gurl = this.b;
            if (i < length) {
                String str = strArr[i];
                if (str == null) {
                    this.o = true;
                    c5381fp2.a(origin, gurl, this);
                    return;
                } else {
                    GURL gurl2 = new GURL(str);
                    if (S34.a(gurl2)) {
                        hashSet2.add(gurl2);
                    } else {
                        hashSet.add(strArr[i]);
                    }
                    i++;
                }
            } else {
                if (strArr.length != 0) {
                    HashMap hashMap = this.c;
                    if (hashSet.containsAll(hashMap.keySet())) {
                        Set set = this.d;
                        if (hashSet2.containsAll(set)) {
                            hashSet2.retainAll(set);
                            Iterator it = hashSet2.iterator();
                            while (true) {
                                boolean hasNext = it.hasNext();
                                interfaceC6069hp2 = this.k;
                                if (!hasNext) {
                                    break;
                                }
                                GURL gurl3 = (GURL) it.next();
                                HashMap hashMap2 = ((C0520Ea) interfaceC6069hp2).m;
                                C0390Da c0390Da = (C0390Da) hashMap2.get(gurl);
                                if (c0390Da == null) {
                                    c0390Da = new C0390Da();
                                    hashMap2.put(gurl, c0390Da);
                                }
                                c0390Da.b.add(gurl3);
                            }
                            if (hashMap.isEmpty()) {
                                ((C0520Ea) interfaceC6069hp2).e();
                                c5381fp2.a(origin, gurl, this);
                                return;
                            }
                            this.n = hashMap.size();
                            for (String str2 : hashMap.keySet()) {
                                PaymentManifestWebDataService paymentManifestWebDataService = this.g;
                                long j = paymentManifestWebDataService.a;
                                if (!(j == 0 ? false : N.MoJqMSqV(j, paymentManifestWebDataService, str2, this))) {
                                    this.o = true;
                                    this.n = 0;
                                    c5381fp2.a(origin, gurl, this);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                }
                this.o = true;
                c5381fp2.a(origin, gurl, this);
                return;
            }
        }
    }

    @Override // org.chromium.components.payments.PaymentManifestWebDataService.PaymentManifestWebDataServiceCallback
    public final void onPaymentWebAppManifestFetched(WebAppManifestSection[] webAppManifestSectionArr) {
        InterfaceC6069hp2 interfaceC6069hp2;
        if (this.o) {
            return;
        }
        Origin origin = this.a;
        C5381fp2 c5381fp2 = this.h;
        GURL gurl = this.b;
        if (webAppManifestSectionArr == null || webAppManifestSectionArr.length == 0) {
            this.o = true;
            this.n = 0;
            c5381fp2.a(origin, gurl, this);
            return;
        }
        Iterator it = c(webAppManifestSectionArr).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            interfaceC6069hp2 = this.k;
            if (!hasNext) {
                break;
            }
            ResolveInfo resolveInfo = ((C5725gp2) this.c.get((String) it.next())).a;
            HashMap hashMap = ((C0520Ea) interfaceC6069hp2).m;
            C0390Da c0390Da = (C0390Da) hashMap.get(gurl);
            if (c0390Da == null) {
                c0390Da = new C0390Da();
                hashMap.put(gurl, c0390Da);
            }
            c0390Da.a.add(resolveInfo);
        }
        int i = this.n - 1;
        this.n = i;
        if (i != 0) {
            return;
        }
        ((C0520Ea) interfaceC6069hp2).e();
        c5381fp2.a(origin, gurl, this);
    }

    @Override // org.chromium.components.payments.PaymentManifestDownloader$ManifestDownloadCallback
    public final void onPaymentMethodManifestDownloadSuccess(GURL gurl, Origin origin, String str) {
        this.m = origin;
        PaymentManifestParser paymentManifestParser = this.i;
        paymentManifestParser.getClass();
        Object obj = ThreadUtils.a;
        N.M$4TUaJ7(paymentManifestParser.a, gurl, str, this);
    }

    @Override // org.chromium.components.payments.PaymentManifestParser.ManifestParseCallback
    public final void onPaymentMethodManifestParseSuccess(GURL[] gurlArr, GURL[] gurlArr2) {
        HashSet hashSet;
        HashSet hashSet2 = new HashSet();
        int i = 0;
        while (true) {
            int length = gurlArr2.length;
            hashSet = this.e;
            if (i >= length) {
                break;
            }
            hashSet2.add(gurlArr2[i]);
            hashSet.add(gurlArr2[i].i());
            i++;
        }
        boolean z = this.o;
        GURL gurl = this.b;
        InterfaceC6069hp2 interfaceC6069hp2 = this.k;
        if (z) {
            hashSet2.retainAll(this.d);
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                GURL gurl2 = (GURL) it.next();
                HashMap hashMap = ((C0520Ea) interfaceC6069hp2).m;
                C0390Da c0390Da = (C0390Da) hashMap.get(gurl);
                if (c0390Da == null) {
                    c0390Da = new C0390Da();
                    hashMap.put(gurl, c0390Da);
                }
                c0390Da.b.add(gurl2);
            }
        }
        if (gurlArr.length == 0) {
            if (this.o) {
                ((C0520Ea) interfaceC6069hp2).e();
            }
            String i2 = gurl.i();
            String[] strArr = (String[]) hashSet.toArray(new String[hashSet.size()]);
            PaymentManifestWebDataService paymentManifestWebDataService = this.g;
            long j = paymentManifestWebDataService.a;
            if (j != 0) {
                N.MoW5wM_G(j, paymentManifestWebDataService, i2, strArr);
            }
            ((C0520Ea) interfaceC6069hp2).d();
            return;
        }
        this.n = gurlArr.length;
        for (int i3 = 0; i3 < gurlArr.length && !this.p; i3++) {
            Origin origin = this.m;
            GURL gurl3 = gurlArr[i3];
            C5381fp2 c5381fp2 = this.h;
            c5381fp2.getClass();
            Object obj = ThreadUtils.a;
            N.MpedIYcV(c5381fp2.a, c5381fp2, origin, gurl3, this);
        }
    }

    @Override // org.chromium.components.payments.PaymentManifestDownloader$ManifestDownloadCallback
    public final void onWebAppManifestDownloadSuccess(String str) {
        if (this.p) {
            return;
        }
        PaymentManifestParser paymentManifestParser = this.i;
        paymentManifestParser.getClass();
        Object obj = ThreadUtils.a;
        N.MhPu7GL6(paymentManifestParser.a, str, this);
    }

    @Override // org.chromium.components.payments.PaymentManifestParser.ManifestParseCallback
    public final void onWebAppManifestParseSuccess(WebAppManifestSection[] webAppManifestSectionArr) {
        HashSet hashSet;
        if (this.p) {
            return;
        }
        int i = 0;
        while (true) {
            int length = webAppManifestSectionArr.length;
            hashSet = this.e;
            if (i >= length) {
                break;
            }
            hashSet.add(webAppManifestSectionArr[i].a);
            i++;
        }
        ArrayList arrayList = this.f;
        arrayList.add(webAppManifestSectionArr);
        boolean z = this.o;
        GURL gurl = this.b;
        InterfaceC6069hp2 interfaceC6069hp2 = this.k;
        if (z) {
            Iterator it = c(webAppManifestSectionArr).iterator();
            while (it.hasNext()) {
                ResolveInfo resolveInfo = ((C5725gp2) this.c.get((String) it.next())).a;
                HashMap hashMap = ((C0520Ea) interfaceC6069hp2).m;
                C0390Da c0390Da = (C0390Da) hashMap.get(gurl);
                if (c0390Da == null) {
                    c0390Da = new C0390Da();
                    hashMap.put(gurl, c0390Da);
                }
                c0390Da.a.add(resolveInfo);
            }
        }
        int i2 = this.n - 1;
        this.n = i2;
        if (i2 != 0) {
            return;
        }
        if (this.o) {
            ((C0520Ea) interfaceC6069hp2).e();
        }
        String obj = gurl.toString();
        String[] strArr = (String[]) hashSet.toArray(new String[hashSet.size()]);
        PaymentManifestWebDataService paymentManifestWebDataService = this.g;
        long j = paymentManifestWebDataService.a;
        if (j != 0) {
            N.MoW5wM_G(j, paymentManifestWebDataService, obj, strArr);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            i3 += ((WebAppManifestSection[]) arrayList.get(i4)).length;
        }
        WebAppManifestSection[] webAppManifestSectionArr2 = new WebAppManifestSection[i3];
        int i5 = 0;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            int i7 = 0;
            while (i7 < ((WebAppManifestSection[]) arrayList.get(i6)).length) {
                webAppManifestSectionArr2[i5] = ((WebAppManifestSection[]) arrayList.get(i6))[i7];
                i7++;
                i5++;
            }
        }
        long j2 = paymentManifestWebDataService.a;
        if (j2 != 0) {
            N.MsHxLyvJ(j2, paymentManifestWebDataService, webAppManifestSectionArr2);
        }
        ((C0520Ea) interfaceC6069hp2).d();
    }

    public final HashSet c(WebAppManifestSection[] webAppManifestSectionArr) {
        ArrayList arrayList = new ArrayList();
        for (WebAppManifestSection webAppManifestSection : webAppManifestSectionArr) {
            HashSet hashSet = new HashSet();
            int i = 0;
            while (true) {
                byte[][] bArr = webAppManifestSection.c;
                if (i < bArr.length) {
                    hashSet.add(a(bArr[i]));
                    i++;
                }
            }
            arrayList.add(hashSet);
        }
        HashSet hashSet2 = new HashSet();
        for (int i2 = 0; i2 < webAppManifestSectionArr.length; i2++) {
            WebAppManifestSection webAppManifestSection2 = webAppManifestSectionArr[i2];
            C5725gp2 c5725gp2 = (C5725gp2) this.c.get(webAppManifestSection2.a);
            if (c5725gp2 != null) {
                long j = c5725gp2.b;
                long j2 = webAppManifestSection2.b;
                String str = webAppManifestSection2.a;
                if (j < j2) {
                    AbstractC4851eH1.a("PaymentManifest", "\"%s\" version is %d, but at least %d is required.", str, Long.valueOf(j), Long.valueOf(j2));
                } else {
                    HashSet hashSet3 = c5725gp2.c;
                    if (hashSet3 == null) {
                        AbstractC4851eH1.a("PaymentManifest", "Unable to determine fingerprints of \"%s\".", str);
                    } else if (!hashSet3.equals(arrayList.get(i2))) {
                        AbstractC4851eH1.a("PaymentManifest", "\"%s\" fingerprints don't match the manifest. Expected %s, but found %s.", str, b((Set) arrayList.get(i2)), b(c5725gp2.c));
                    } else {
                        hashSet2.add(str);
                    }
                }
            }
        }
        return hashSet2;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append(' ');
            sb.append(str);
        }
        sb.append(" ]");
        return sb.toString();
    }

    @Override // org.chromium.components.payments.PaymentManifestDownloader$ManifestDownloadCallback
    public final void onManifestDownloadFailure(String str) {
        if (this.p) {
            return;
        }
        this.p = true;
        InterfaceC6069hp2 interfaceC6069hp2 = this.k;
        ((C0520Ea) interfaceC6069hp2).f.c(str, 0);
        if (this.o) {
            ((C0520Ea) interfaceC6069hp2).e();
        }
        ((C0520Ea) interfaceC6069hp2).d();
    }

    @Override // org.chromium.components.payments.PaymentManifestParser.ManifestParseCallback
    public final void onManifestParseFailure() {
        if (this.p) {
            return;
        }
        this.p = true;
        boolean z = this.o;
        InterfaceC6069hp2 interfaceC6069hp2 = this.k;
        if (z) {
            ((C0520Ea) interfaceC6069hp2).e();
        }
        ((C0520Ea) interfaceC6069hp2).d();
    }
}
