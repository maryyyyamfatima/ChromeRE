package defpackage;

import android.os.Parcel;
import android.os.SharedMemory;
import android.system.ErrnoException;
import android.system.OsConstants;
import com.google.protobuf.MessageLite;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ej2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5001ej2 {
    public final byte[] a;

    public C5001ej2(byte[] bArr) {
        this.a = bArr;
    }

    public final void c(Parcel parcel, int i) {
        SharedMemory create;
        ByteBuffer mapReadWrite;
        byte[] bArr = this.a;
        if (bArr.length <= 16384) {
            parcel.writeInt(0);
            parcel.writeByteArray(bArr);
            return;
        }
        parcel.writeInt(1);
        try {
            create = SharedMemory.create("ParceledMessageLite", bArr.length);
            try {
                create.setProtect(OsConstants.PROT_READ | OsConstants.PROT_WRITE);
                mapReadWrite = create.mapReadWrite();
                mapReadWrite.put(bArr);
                create.setProtect(OsConstants.PROT_READ);
                create.writeToParcel(parcel, i);
                create.close();
            } catch (Throwable th) {
                if (create != null) {
                    try {
                        create.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (ErrnoException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static C5001ej2 a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new C5001ej2(parcel.createByteArray());
        }
        if (readInt != 1) {
            throw new IllegalArgumentException(AbstractC9076qb1.a("Unknown storage: ", readInt));
        }
        try {
            SharedMemory sharedMemory = (SharedMemory) SharedMemory.CREATOR.createFromParcel(parcel);
            try {
                ByteBuffer mapReadOnly = sharedMemory.mapReadOnly();
                byte[] bArr = new byte[mapReadOnly.remaining()];
                mapReadOnly.get(bArr);
                C5001ej2 c5001ej2 = new C5001ej2(bArr);
                sharedMemory.close();
                return c5001ej2;
            } catch (Throwable th) {
                if (sharedMemory != null) {
                    try {
                        sharedMemory.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (ErrnoException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final MessageLite b(QX0 qx0) {
        try {
            JX0 jx0 = (JX0) qx0.l(PX0.NEW_BUILDER);
            jx0.m(qx0);
            byte[] bArr = this.a;
            jx0.n(bArr, bArr.length, XF0.c());
            return jx0.j();
        } catch (C1127Ir1 e) {
            throw new IllegalArgumentException(e);
        }
    }
}
