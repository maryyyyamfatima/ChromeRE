package com.google.android.gms.instantapps;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.C0377Cx1;
import defpackage.RT2;
import java.io.DataInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LaunchData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C0377Cx1();
    public final Intent a;
    public final String g;
    public final String h;
    public final BitmapTeleporter i;
    public final Bitmap j;

    public LaunchData(Intent intent, String str, String str2, BitmapTeleporter bitmapTeleporter) {
        Bitmap bitmap;
        this.a = intent;
        this.g = str;
        this.h = str2;
        this.i = bitmapTeleporter;
        if (bitmapTeleporter != null) {
            if (!bitmapTeleporter.j) {
                DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(bitmapTeleporter.g));
                try {
                    try {
                        byte[] bArr = new byte[dataInputStream.readInt()];
                        int readInt = dataInputStream.readInt();
                        int readInt2 = dataInputStream.readInt();
                        Bitmap.Config valueOf = Bitmap.Config.valueOf(dataInputStream.readUTF());
                        dataInputStream.read(bArr);
                        bitmapTeleporter.r1(dataInputStream);
                        ByteBuffer wrap = ByteBuffer.wrap(bArr);
                        Bitmap createBitmap = Bitmap.createBitmap(readInt, readInt2, valueOf);
                        createBitmap.copyPixelsFromBuffer(wrap);
                        bitmapTeleporter.i = createBitmap;
                        bitmapTeleporter.j = true;
                    } catch (IOException e) {
                        throw new IllegalStateException("Could not read from parcel file descriptor", e);
                    }
                } catch (Throwable th) {
                    bitmapTeleporter.r1(dataInputStream);
                    throw th;
                }
            }
            bitmap = bitmapTeleporter.i;
        } else {
            bitmap = null;
        }
        this.j = bitmap;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = RT2.a(20293, parcel);
        RT2.n(parcel, 2, this.a, i);
        RT2.o(parcel, 3, this.g);
        RT2.o(parcel, 4, this.h);
        RT2.n(parcel, 5, this.i, i);
        RT2.b(a, parcel);
    }
}
