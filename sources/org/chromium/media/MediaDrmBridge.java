package org.chromium.media;

import J.N;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.os.Handler;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC9771sd;
import defpackage.BN1;
import defpackage.CN1;
import defpackage.EN1;
import defpackage.FN1;
import defpackage.GN1;
import defpackage.IN1;
import defpackage.KN1;
import defpackage.LN1;
import defpackage.MN1;
import defpackage.NN1;
import defpackage.ON1;
import defpackage.PN1;
import defpackage.QN1;
import defpackage.RN1;
import defpackage.SN1;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MediaDrmBridge {
    public static final UUID l = UUID.fromString("edef8ba9-79d6-4ace-a3c8-27dcd51d21ed");
    public static final byte[] m = {0};
    public static final byte[] n = AbstractC9771sd.b("unprovision");
    public static final MN1 o = new MN1();
    public MediaDrm a;
    public MediaCrypto b;
    public long c;
    public final UUID d;
    public final boolean e;
    public PN1 f;
    public RN1 g;
    public final SN1 h;
    public String i;
    public boolean j;
    public NN1 k;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public class KeyStatus {
        public final byte[] a;
        public final int b;

        public KeyStatus(byte[] bArr, int i) {
            this.a = bArr;
            this.b = i;
        }

        public final byte[] getKeyId() {
            return this.a;
        }

        public final int getStatusCode() {
            return this.b;
        }
    }

    public static UUID g(byte[] bArr) {
        if (bArr.length != 16) {
            return null;
        }
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 8; i++) {
            j2 = (j2 << 8) | (bArr[i] & 255);
        }
        for (int i2 = 8; i2 < 16; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return new UUID(j2, j);
    }

    public final boolean h() {
        return this.c != 0;
    }

    public final boolean setServerCertificate(byte[] bArr) {
        if (!this.d.equals(l)) {
            return true;
        }
        try {
            this.a.setPropertyByteArray("serviceCertificate", bArr);
            return true;
        } catch (IllegalArgumentException e) {
            AbstractC4851eH1.a("media", "Failed to set server certificate", e);
            return false;
        } catch (IllegalStateException e2) {
            AbstractC4851eH1.a("media", "Failed to set server certificate", e2);
            return false;
        }
    }

    public MediaDrmBridge(UUID uuid, boolean z, long j, long j2) {
        this.d = uuid;
        this.a = new MediaDrm(uuid);
        this.e = z;
        this.c = j;
        SN1 sn1 = new SN1(j2);
        this.h = sn1;
        this.g = new RN1(sn1);
        this.a.setOnEventListener(new GN1(this));
        this.a.setOnExpirationUpdateListener(new IN1(this), (Handler) null);
        this.a.setOnKeyStatusChangeListener(new KN1(this), (Handler) null);
        if (uuid.equals(l)) {
            this.a.setPropertyString("privacyMode", "enable");
            this.a.setPropertyString("sessionSharing", "enable");
        }
    }

    public final boolean d() {
        UUID uuid = this.d;
        try {
            byte[] m2 = m();
            if (m2 != null) {
                PN1 pn1 = new PN1(m2, m2, null);
                this.f = pn1;
                pn1.b();
                try {
                } catch (MediaCryptoException e) {
                    AbstractC4851eH1.a("media", "Cannot create MediaCrypto", e);
                }
                if (MediaCrypto.isCryptoSchemeSupported(uuid)) {
                    MediaCrypto mediaCrypto = new MediaCrypto(uuid, this.f.b);
                    this.b = mediaCrypto;
                    if (h()) {
                        N.MV9yuwVC(this.c, this, mediaCrypto);
                    }
                    return true;
                }
                AbstractC4851eH1.a("media", "Cannot create MediaCrypto for unsupported scheme.", new Object[0]);
                o();
                return false;
            }
            AbstractC4851eH1.a("media", "Cannot create MediaCrypto Session.", new Object[0]);
            return false;
        } catch (NotProvisionedException unused) {
            MN1 mn1 = o;
            if (mn1.a) {
                mn1.b.add(new BN1(this));
                return true;
            }
            return p();
        }
    }

    public final byte[] m() {
        try {
            return (byte[]) this.a.openSession().clone();
        } catch (NotProvisionedException e) {
            throw e;
        } catch (MediaDrmException e2) {
            AbstractC4851eH1.a("media", "Cannot open a new session", e2);
            o();
            return null;
        } catch (RuntimeException e3) {
            AbstractC4851eH1.a("media", "Cannot open a new session", e3);
            o();
            return null;
        }
    }

    public static boolean isCryptoSchemeSupported(byte[] bArr, String str) {
        UUID g = g(bArr);
        if (str.isEmpty()) {
            return MediaDrm.isCryptoSchemeSupported(g);
        }
        return MediaDrm.isCryptoSchemeSupported(g, str);
    }

    public static int getFirstApiLevel() {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "ro.product.first_api_level", 0)).intValue();
        } catch (Exception e) {
            AbstractC4851eH1.a("media", "Exception while getting system property %s. Using default.", "ro.product.first_api_level", e);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.chromium.media.MediaDrmBridge create(byte[] r16, java.lang.String r17, java.lang.String r18, boolean r19, long r20, long r22) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.media.MediaDrmBridge.create(byte[], java.lang.String, java.lang.String, boolean, long, long):org.chromium.media.MediaDrmBridge");
    }

    public final void provision() {
        if (!this.j) {
            AbstractC4851eH1.a("media", "Calling provision() without an origin.", new Object[0]);
            N.MAaklmRW(this.c, this, false);
            return;
        }
        try {
            byte[] m2 = m();
            if (m2 != null) {
                c(new PN1(m2, m2, null));
            }
            N.MAaklmRW(this.c, this, true);
        } catch (NotProvisionedException unused) {
            if (p()) {
                return;
            }
            N.MAaklmRW(this.c, this, false);
        }
    }

    public final void unprovision() {
        if (this.a != null && this.j) {
            n(n);
        }
    }

    public final void destroy() {
        this.c = 0L;
        if (this.a != null) {
            o();
        }
    }

    public final void o() {
        RN1 rn1 = this.g;
        rn1.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = rn1.a.values().iterator();
        while (it.hasNext()) {
            arrayList.add(((QN1) it.next()).a);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            PN1 pn1 = (PN1) it2.next();
            try {
                this.a.removeKeys(pn1.b);
            } catch (Exception e) {
                AbstractC4851eH1.a("media", "removeKeys failed: ", e);
            }
            c(pn1);
            if (h()) {
                N.MulYy5b7(this.c, this, pn1.a);
            }
        }
        this.g = new RN1(this.h);
        PN1 pn12 = this.f;
        if (pn12 != null) {
            c(pn12);
            this.f = null;
        }
        MediaDrm mediaDrm = this.a;
        if (mediaDrm != null) {
            mediaDrm.release();
            this.a = null;
        }
        MediaCrypto mediaCrypto = this.b;
        if (mediaCrypto != null) {
            mediaCrypto.release();
            this.b = null;
        } else if (h()) {
            N.MV9yuwVC(this.c, this, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MediaDrm.KeyRequest e(PN1 pn1, byte[] bArr, String str, int i, HashMap hashMap) {
        byte[] bArr2;
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        HashMap hashMap2 = hashMap;
        try {
            if (i != 3) {
                bArr2 = pn1.b;
            } else {
                bArr2 = pn1.c;
            }
            return this.a.getKeyRequest(bArr2, bArr, str, i, hashMap2);
        } catch (IllegalStateException e) {
            AbstractC4851eH1.a("media", "Failed to getKeyRequest().", e);
            return null;
        }
    }

    public final void createSessionFromNative(byte[] bArr, String str, int i, String[] strArr, long j) {
        boolean z;
        PN1 pn1;
        HashMap hashMap = new HashMap();
        if (strArr != null) {
            if (strArr.length % 2 != 0) {
                throw new IllegalArgumentException("Additional data array doesn't have equal keys/values");
            }
            for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                hashMap.put(strArr[i2], strArr[i2 + 1]);
            }
        }
        if (this.a == null) {
            AbstractC4851eH1.a("media", "createSession() called when MediaDrm is null.", new Object[0]);
            i(j, "MediaDrm released previously.");
            return;
        }
        try {
            byte[] m2 = m();
            if (m2 == null) {
                i(j, "Open session failed.");
                return;
            }
            try {
                if (i != 2) {
                    pn1 = new PN1(m2, m2, null);
                } else {
                    char[] cArr = PN1.d;
                    pn1 = new PN1(AbstractC9771sd.b(UUID.randomUUID().toString().replace('-', '0')), m2, null);
                }
                MediaDrm.KeyRequest e = e(pn1, bArr, str, i, hashMap);
                if (e == null) {
                    c(pn1);
                    i(j, "Generate request failed.");
                    return;
                }
                pn1.b();
                j(j, pn1);
                l(pn1, e);
                RN1 rn1 = this.g;
                rn1.getClass();
                QN1 qn1 = new QN1(pn1, str, i);
                rn1.a.put(ByteBuffer.wrap(pn1.a), qn1);
                byte[] bArr2 = pn1.b;
                if (bArr2 != null) {
                    rn1.b.put(ByteBuffer.wrap(bArr2), qn1);
                }
            } catch (NotProvisionedException e2) {
                e = e2;
                z = true;
                AbstractC4851eH1.a("media", "Device not provisioned", e);
                if (z) {
                    c(null);
                }
                i(j, "Device not provisioned during createSession().");
            }
        } catch (NotProvisionedException e3) {
            e = e3;
            z = false;
        }
    }

    public final PN1 f(byte[] bArr) {
        if (this.f != null) {
            QN1 qn1 = (QN1) this.g.a.get(ByteBuffer.wrap(bArr));
            PN1 pn1 = qn1 == null ? null : qn1.a;
            if (pn1 == null) {
                return null;
            }
            return pn1;
        }
        AbstractC4851eH1.a("media", "Session doesn't exist because media crypto session is not created.", new Object[0]);
        return null;
    }

    public static PN1 a(MediaDrmBridge mediaDrmBridge, byte[] bArr) {
        if (mediaDrmBridge.f != null) {
            QN1 qn1 = (QN1) mediaDrmBridge.g.b.get(ByteBuffer.wrap(bArr));
            PN1 pn1 = qn1 == null ? null : qn1.a;
            if (pn1 == null) {
                return null;
            }
            return pn1;
        }
        AbstractC4851eH1.a("media", "Session doesn't exist because media crypto session is not created.", new Object[0]);
        return null;
    }

    public final void closeSession(byte[] bArr, long j) {
        if (this.a == null) {
            i(j, "closeSession() called when MediaDrm is null.");
            return;
        }
        PN1 f = f(bArr);
        if (f == null) {
            i(j, "Invalid sessionId in closeSession(): " + PN1.a(bArr));
            return;
        }
        try {
            this.a.removeKeys(f.b);
        } catch (Exception e) {
            AbstractC4851eH1.a("media", "removeKeys failed: ", e);
        }
        c(f);
        RN1 rn1 = this.g;
        rn1.a(f);
        rn1.a.remove(ByteBuffer.wrap(f.a));
        byte[] bArr2 = f.b;
        if (bArr2 != null) {
            rn1.b.remove(ByteBuffer.wrap(bArr2));
        }
        if (h()) {
            N.MOzXytse(this.c, this, j);
        }
        if (h()) {
            N.MulYy5b7(this.c, this, f.a);
        }
        f.b();
    }

    public final void c(PN1 pn1) {
        try {
            this.a.closeSession(pn1.b);
        } catch (Exception e) {
            AbstractC4851eH1.a("media", "closeSession failed: ", e);
        }
    }

    public final void updateSession(byte[] bArr, byte[] bArr2, long j) {
        byte[] provideKeyResponse;
        if (this.a == null) {
            i(j, "updateSession() called when MediaDrm is null.");
            return;
        }
        PN1 f = f(bArr);
        if (f == null) {
            i(j, "Invalid session in updateSession: " + PN1.a(bArr));
            return;
        }
        try {
            QN1 a = this.g.a(f);
            boolean z = a.c == 3;
            if (z) {
                this.a.provideKeyResponse(f.c, bArr2);
                provideKeyResponse = null;
            } else {
                provideKeyResponse = this.a.provideKeyResponse(f.b, bArr2);
            }
            LN1 ln1 = new LN1(this, f, j, z);
            if (!z) {
                if (a.c == 2 && provideKeyResponse != null && provideKeyResponse.length > 0) {
                    this.g.b(f, provideKeyResponse, ln1);
                    return;
                } else {
                    ln1.onResult(Boolean.TRUE);
                    return;
                }
            }
            RN1 rn1 = this.g;
            rn1.getClass();
            f.c = null;
            SN1 sn1 = rn1.c;
            long j2 = sn1.a;
            if (!(j2 != -1)) {
                ln1.onResult(Boolean.TRUE);
            } else {
                N.MYa_y6Dg(j2, sn1, f.a, ln1);
            }
        } catch (DeniedByServerException e) {
            AbstractC4851eH1.a("media", "failed to provide key response", e);
            i(j, "Update session failed.");
            o();
        } catch (NotProvisionedException e2) {
            AbstractC4851eH1.a("media", "failed to provide key response", e2);
            i(j, "Update session failed.");
            o();
        } catch (IllegalStateException e3) {
            AbstractC4851eH1.a("media", "failed to provide key response", e3);
            i(j, "Update session failed.");
            o();
        }
    }

    public final void loadSession(byte[] bArr, long j) {
        RN1 rn1 = this.g;
        CN1 cn1 = new CN1(this, j);
        rn1.getClass();
        ON1 on1 = new ON1(rn1, cn1);
        SN1 sn1 = rn1.c;
        long j2 = sn1.a;
        if (!(j2 != -1)) {
            on1.onResult(null);
        } else {
            N.Mmi_qOX8(j2, sn1, bArr, on1);
        }
    }

    public final void removeSession(byte[] bArr, long j) {
        PN1 f = f(bArr);
        if (f == null) {
            i(j, "Session doesn't exist");
            return;
        }
        QN1 a = this.g.a(f);
        if (a.c == 1) {
            i(j, "Removing temporary session isn't implemented");
            return;
        }
        RN1 rn1 = this.g;
        EN1 en1 = new EN1(this, j, f, a);
        QN1 a2 = rn1.a(f);
        a2.c = 3;
        PN1 pn1 = a2.a;
        MediaDrmStorageBridge$PersistentInfo mediaDrmStorageBridge$PersistentInfo = new MediaDrmStorageBridge$PersistentInfo(pn1.a, pn1.c, a2.b, 3);
        SN1 sn1 = rn1.c;
        long j2 = sn1.a;
        if (!(j2 != -1)) {
            en1.onResult(Boolean.FALSE);
        } else {
            N.MeALR1v2(j2, sn1, mediaDrmStorageBridge$PersistentInfo, en1);
        }
    }

    public final String getSecurityLevel() {
        if (this.a == null || !this.d.equals(l)) {
            AbstractC4851eH1.a("media", "getSecurityLevel(): MediaDrm is null or security level is not supported.", new Object[0]);
            return "";
        }
        try {
            return this.a.getPropertyString("securityLevel");
        } catch (IllegalStateException e) {
            AbstractC4851eH1.a("media", "Failed to get current security level", e);
            return "";
        } catch (Exception e2) {
            AbstractC4851eH1.a("media", "Failed to get current security level", e2);
            return "";
        }
    }

    public final boolean p() {
        if (!h()) {
            return false;
        }
        if (this.e) {
            o.a = true;
        }
        try {
            MediaDrm.ProvisionRequest provisionRequest = this.a.getProvisionRequest();
            Object[] objArr = new Object[1];
            objArr[0] = this.j ? this.i : "<none>";
            AbstractC4851eH1.d("media", "Provisioning origin ID %s", objArr);
            N.MmhSkOYV(this.c, this, provisionRequest.getDefaultUrl(), provisionRequest.getData());
            return true;
        } catch (IllegalStateException e) {
            AbstractC4851eH1.a("media", "Failed to get provisioning request", e);
            return false;
        }
    }

    public final void processProvisionResponse(boolean z, byte[] bArr) {
        boolean n2 = (this.a == null || !z) ? false : n(bArr);
        boolean z2 = this.e;
        if (!z2) {
            N.MAaklmRW(this.c, this, n2);
            if (!n2) {
                o();
            }
        } else if (!n2) {
            o();
        } else if (!this.j) {
            d();
        } else {
            FN1 fn1 = new FN1(this);
            SN1 sn1 = this.h;
            long j = sn1.a;
            if (!(j != -1)) {
                fn1.onResult(Boolean.TRUE);
            } else {
                N.ME6vNmlv(j, sn1, fn1);
            }
        }
        if (z2) {
            MN1 mn1 = o;
            mn1.a = false;
            do {
                ArrayDeque arrayDeque = mn1.b;
                if (arrayDeque.isEmpty()) {
                    return;
                }
                Runnable runnable = (Runnable) arrayDeque.element();
                arrayDeque.remove();
                runnable.run();
            } while (!mn1.a);
        }
    }

    public final boolean n(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            AbstractC4851eH1.a("media", "Invalid provision response.", new Object[0]);
            return false;
        }
        try {
            this.a.provideProvisionResponse(bArr);
            return true;
        } catch (DeniedByServerException e) {
            AbstractC4851eH1.a("media", "failed to provide provision response", e);
            return false;
        } catch (IllegalStateException e2) {
            AbstractC4851eH1.a("media", "failed to provide provision response", e2);
            return false;
        }
    }

    public static void b(MediaDrmBridge mediaDrmBridge, PN1 pn1, Runnable runnable) {
        NN1 nn1 = mediaDrmBridge.k;
        if (nn1 != null) {
            PN1 pn12 = nn1.a;
            pn12.getClass();
            if (Arrays.equals(pn12.a, pn1.a)) {
                mediaDrmBridge.k.b.add(runnable);
                return;
            }
        }
        runnable.run();
    }

    public final void j(long j, PN1 pn1) {
        if (h()) {
            N.MtWWjNjU(this.c, this, j, pn1.a);
        }
    }

    public final void i(long j, String str) {
        AbstractC4851eH1.a("media", "onPromiseRejected: %s", str);
        if (h()) {
            N.M2P7BQ98(this.c, this, j, str);
        }
    }

    public final void l(PN1 pn1, MediaDrm.KeyRequest keyRequest) {
        if (h()) {
            N.Mf7HZHqV(this.c, this, pn1.a, keyRequest.getRequestType(), keyRequest.getData());
        }
    }

    public final void k(PN1 pn1, Object[] objArr, boolean z, boolean z2) {
        if (h()) {
            N.Mk8V79M2(this.c, this, pn1.a, objArr, z, z2);
        }
    }
}
