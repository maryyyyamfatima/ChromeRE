package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C6942kN0;
import defpackage.RT2;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FileTeleporter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C6942kN0();
    public ParcelFileDescriptor a;
    public final String g;
    public final String h;
    public final byte[] i;
    public File j;

    public FileTeleporter(ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.a = parcelFileDescriptor;
        this.g = str;
        this.h = str2;
    }

    public FileTeleporter(byte[] bArr) {
        this(null, "text/plain", "Metrics");
        this.i = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.i;
        ParcelFileDescriptor parcelFileDescriptor = this.a;
        String str = this.h;
        String str2 = this.g;
        if (parcelFileDescriptor == null) {
            File file = this.j;
            if (file == null) {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
            }
            try {
                File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    this.a = ParcelFileDescriptor.open(createTempFile, 268435456);
                    createTempFile.delete();
                    DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                    try {
                        try {
                            dataOutputStream.writeInt(bArr.length);
                            dataOutputStream.writeUTF(str2);
                            dataOutputStream.writeUTF(str);
                            dataOutputStream.write(bArr);
                            try {
                                dataOutputStream.close();
                            } catch (IOException e) {
                                Log.w("FileTeleporter", "Could not close stream", e);
                            }
                        } catch (IOException e2) {
                            throw new IllegalStateException("Could not write into unlinked file", e2);
                        }
                    } catch (Throwable th) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException e3) {
                            Log.w("FileTeleporter", "Could not close stream", e3);
                        }
                        throw th;
                    }
                } catch (FileNotFoundException unused) {
                    throw new IllegalStateException("Temporary file is somehow already deleted.");
                }
            } catch (IOException e4) {
                throw new IllegalStateException("Could not create temporary file:", e4);
            }
        }
        int a = RT2.a(20293, parcel);
        RT2.n(parcel, 2, this.a, i);
        RT2.o(parcel, 3, str2);
        RT2.o(parcel, 4, str);
        RT2.b(a, parcel);
    }
}
