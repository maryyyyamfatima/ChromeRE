package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jO3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6606jO3 {
    public final byte[] a;
    public String b;
    public ArrayList c;

    public C6606jO3(byte[] bArr) {
        this.a = bArr;
    }

    public static C6606jO3 a(String str, List list) {
        Collections.sort(list, new Comparator() { // from class: iO3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr == bArr2) {
                    return 0;
                }
                if (bArr == null) {
                    return -1;
                }
                if (bArr2 == null) {
                    return 1;
                }
                for (int i = 0; i < Math.min(bArr.length, bArr2.length); i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                return 0;
            }
        });
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return new C6606jO3(byteArrayOutputStream.toByteArray(), str, list);
    }

    public C6606jO3(byte[] bArr, String str, List list) {
        this.a = bArr;
        this.b = str;
        this.c = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            this.c.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6606jO3.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((C6606jO3) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final void b() {
        if (this.b != null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.a));
        this.b = dataInputStream.readUTF();
        int readInt = dataInputStream.readInt();
        this.c = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = dataInputStream.readInt();
            byte[] bArr = new byte[readInt2];
            if (dataInputStream.read(bArr) != readInt2) {
                throw new IllegalStateException("Could not read fingerprint");
            }
            this.c.add(bArr);
        }
    }
}
