package defpackage;

import J.N;
import android.content.IntentFilter;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.chromium.net.AndroidCertVerifyResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fr4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5395fr4 {
    public static CertificateFactory a;
    public static X509TrustManagerExtensions b;
    public static C5051er4 c;
    public static X509TrustManagerExtensions d;
    public static KeyStore e;
    public static KeyStore f;
    public static File g;
    public static HashSet h;
    public static boolean i;
    public static final Object j = new Object();
    public static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static X509Certificate b(byte[] bArr) {
        synchronized (j) {
            d();
        }
        return (X509Certificate) a.generateCertificate(new ByteArrayInputStream(bArr));
    }

    public static void d() {
        if (a == null) {
            a = CertificateFactory.getInstance("X.509");
        }
        if (b == null) {
            b = c(null);
        }
        if (!i) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
                f = keyStore;
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
                g = new File(System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
            } catch (KeyStoreException unused2) {
            }
            i = true;
        }
        if (h == null) {
            h = new HashSet();
        }
        if (e == null) {
            KeyStore keyStore2 = KeyStore.getInstance(KeyStore.getDefaultType());
            e = keyStore2;
            try {
                keyStore2.load(null);
            } catch (IOException unused3) {
            }
        }
        if (d == null) {
            d = c(e);
        }
        if (c == null) {
            c = new C5051er4();
            IntentFilter intentFilter = new IntentFilter();
            if (Build.VERSION.SDK_INT >= 26) {
                intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
                intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
                intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
            } else {
                intentFilter.addAction("android.security.STORAGE_CHANGED");
            }
            V60.d(V60.a, c, intentFilter);
        }
    }

    public static X509TrustManagerExtensions c(KeyStore keyStore) {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        try {
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    try {
                        return new X509TrustManagerExtensions((X509TrustManager) trustManager);
                    } catch (IllegalArgumentException e2) {
                        AbstractC4851eH1.a("X509Util", "Error creating trust manager (" + trustManager.getClass().getName() + "): " + e2, new Object[0]);
                    }
                }
            }
            AbstractC4851eH1.a("X509Util", "Could not find suitable trust manager", new Object[0]);
            return null;
        } catch (RuntimeException e3) {
            AbstractC4851eH1.a("X509Util", "TrustManagerFactory.getTrustManagers() unexpectedly threw: %s", e3);
            throw new KeyStoreException(e3);
        }
    }

    public static void a() {
        synchronized (j) {
            b = null;
            h = null;
            d();
        }
        N.MGVAvp19();
    }

    public static boolean e(X509Certificate x509Certificate) {
        if (f == null) {
            return false;
        }
        Pair pair = new Pair(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
        if (h.contains(pair)) {
            return true;
        }
        byte[] digest = MessageDigest.getInstance("MD5").digest(x509Certificate.getSubjectX500Principal().getEncoded());
        char[] cArr = new char[8];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i2 * 2;
            char[] cArr2 = k;
            byte b2 = digest[3 - i2];
            cArr[i3] = cArr2[(b2 >> 4) & 15];
            cArr[i3 + 1] = cArr2[b2 & 15];
        }
        String str = new String(cArr);
        int i4 = 0;
        while (true) {
            String str2 = str + '.' + i4;
            if (!new File(g, str2).exists()) {
                return false;
            }
            Certificate certificate = f.getCertificate("system:" + str2);
            if (certificate != null) {
                if (!(certificate instanceof X509Certificate)) {
                    AbstractC4851eH1.a("X509Util", IR0.a("Anchor ", str2, " not an X509Certificate: ", certificate.getClass().getName()), new Object[0]);
                } else {
                    X509Certificate x509Certificate2 = (X509Certificate) certificate;
                    if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                        h.add(pair);
                        return true;
                    }
                }
            }
            i4++;
        }
    }

    public static boolean f(X509Certificate x509Certificate) {
        List<String> extendedKeyUsage;
        try {
            extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
        } catch (NullPointerException unused) {
        }
        if (extendedKeyUsage == null) {
            return true;
        }
        for (String str : extendedKeyUsage) {
            if (str.equals("1.3.6.1.5.5.7.3.1") || str.equals("2.5.29.37.0") || str.equals("2.16.840.1.113730.4.1") || str.equals("1.3.6.1.4.1.311.10.3.3")) {
                return true;
            }
        }
        return false;
    }

    public static AndroidCertVerifyResult g(byte[][] bArr, String str, String str2) {
        List<X509Certificate> checkServerTrusted;
        if (bArr != null && bArr.length != 0) {
            if (bArr[0] != null) {
                try {
                    synchronized (j) {
                        d();
                    }
                    ArrayList arrayList = new ArrayList();
                    try {
                        arrayList.add(b(bArr[0]));
                        for (int i2 = 1; i2 < bArr.length; i2++) {
                            try {
                                arrayList.add(b(bArr[i2]));
                            } catch (CertificateException unused) {
                                AbstractC4851eH1.f("X509Util", AbstractC9307rF1.a("intermediate ", i2, " failed parsing"), new Object[0]);
                            }
                        }
                        X509Certificate[] x509CertificateArr = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                        try {
                            x509CertificateArr[0].checkValidity();
                            if (!f(x509CertificateArr[0])) {
                                return new AndroidCertVerifyResult(-6);
                            }
                            synchronized (j) {
                                X509TrustManagerExtensions x509TrustManagerExtensions = b;
                                if (x509TrustManagerExtensions != null) {
                                    try {
                                        try {
                                            checkServerTrusted = x509TrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, str2);
                                        } catch (CertificateException e2) {
                                            try {
                                                try {
                                                    checkServerTrusted = d.checkServerTrusted(x509CertificateArr, str, str2);
                                                } catch (RuntimeException e3) {
                                                    AbstractC4851eH1.a("X509Util", "checkServerTrusted() unexpectedly threw: %s", e3);
                                                    throw new CertificateException(e3);
                                                }
                                            } catch (CertificateException unused2) {
                                                AbstractC4851eH1.d("X509Util", "Failed to validate the certificate chain, error: " + e2.getMessage(), new Object[0]);
                                                return new AndroidCertVerifyResult(-2);
                                            }
                                        }
                                        return new AndroidCertVerifyResult(checkServerTrusted, checkServerTrusted.size() > 0 ? e(checkServerTrusted.get(checkServerTrusted.size() - 1)) : false);
                                    } catch (RuntimeException e4) {
                                        AbstractC4851eH1.a("X509Util", "checkServerTrusted() unexpectedly threw: %s", e4);
                                        throw new CertificateException(e4);
                                    }
                                }
                                return new AndroidCertVerifyResult(-1);
                            }
                        } catch (CertificateExpiredException unused3) {
                            return new AndroidCertVerifyResult(-3);
                        } catch (CertificateNotYetValidException unused4) {
                            return new AndroidCertVerifyResult(-4);
                        } catch (CertificateException unused5) {
                            return new AndroidCertVerifyResult(-1);
                        }
                    } catch (CertificateException unused6) {
                        return new AndroidCertVerifyResult(-5);
                    }
                } catch (CertificateException unused7) {
                    return new AndroidCertVerifyResult(-1);
                }
            }
        }
        throw new IllegalArgumentException("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=" + Arrays.deepToString(bArr));
    }
}
