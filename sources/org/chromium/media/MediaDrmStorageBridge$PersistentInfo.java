package org.chromium.media;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MediaDrmStorageBridge$PersistentInfo {
    public final byte[] a;
    public final byte[] b;
    public final String c;
    public final int d;

    public static MediaDrmStorageBridge$PersistentInfo create(byte[] bArr, byte[] bArr2, String str, int i) {
        return new MediaDrmStorageBridge$PersistentInfo(bArr, bArr2, str, i);
    }

    public MediaDrmStorageBridge$PersistentInfo(byte[] bArr, byte[] bArr2, String str, int i) {
        this.a = bArr;
        this.b = bArr2;
        this.c = str;
        this.d = i;
    }

    public byte[] emeId() {
        return this.a;
    }

    public byte[] keySetId() {
        return this.b;
    }

    public String mimeType() {
        return this.c;
    }

    public int keyType() {
        return this.d;
    }
}
