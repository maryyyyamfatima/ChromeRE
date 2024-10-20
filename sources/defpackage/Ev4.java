package defpackage;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Ev4 extends X509Certificate {
    public final X509Certificate a;
    public final byte[] g;

    public Ev4(X509Certificate x509Certificate, byte[] bArr) {
        this.a = x509Certificate;
        this.g = bArr;
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void checkValidity() {
        this.a.checkValidity();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void checkValidity(Date date) {
        this.a.checkValidity(date);
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int getBasicConstraints() {
        return this.a.getBasicConstraints();
    }

    @Override // java.security.cert.X509Extension
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Set getCriticalExtensionOIDs() {
        return this.a.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Extension
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final byte[] getExtensionValue(String str) {
        return this.a.getExtensionValue(str);
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Principal getIssuerDN() {
        return this.a.getIssuerDN();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final boolean[] getIssuerUniqueID() {
        return this.a.getIssuerUniqueID();
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.g;
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final boolean[] getKeyUsage() {
        return this.a.getKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Set getNonCriticalExtensionOIDs() {
        return this.a.getNonCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Date getNotAfter() {
        return this.a.getNotAfter();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final Date getNotBefore() {
        return this.a.getNotBefore();
    }

    @Override // java.security.cert.Certificate
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final PublicKey getPublicKey() {
        return this.a.getPublicKey();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final BigInteger getSerialNumber() {
        return this.a.getSerialNumber();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final String getSigAlgName() {
        return this.a.getSigAlgName();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final String getSigAlgOID() {
        return this.a.getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final byte[] getSigAlgParams() {
        return this.a.getSigAlgParams();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final byte[] getSignature() {
        return this.a.getSignature();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Principal getSubjectDN() {
        return this.a.getSubjectDN();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final boolean[] getSubjectUniqueID() {
        return this.a.getSubjectUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final byte[] getTBSCertificate() {
        return this.a.getTBSCertificate();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final int getVersion() {
        return this.a.getVersion();
    }

    @Override // java.security.cert.X509Extension
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final boolean hasUnsupportedCriticalExtension() {
        return this.a.hasUnsupportedCriticalExtension();
    }

    @Override // java.security.cert.Certificate
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return this.a.toString();
    }

    @Override // java.security.cert.Certificate
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void verify(PublicKey publicKey) {
        this.a.verify(publicKey);
    }

    @Override // java.security.cert.Certificate
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void verify(PublicKey publicKey, String str) {
        this.a.verify(publicKey, str);
    }
}
