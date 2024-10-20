package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GM {
    public final ArrayList a;
    public final ArrayList b;

    public GM(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor == null) {
            return;
        }
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(parcelFileDescriptor.getFileDescriptor()));
            this.a = (ArrayList) objectInputStream.readObject();
            this.b = (ArrayList) objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public GM(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GM)) {
            return false;
        }
        GM gm = (GM) obj;
        return this.a.equals(gm.a) && Arrays.deepEquals(this.b.toArray(), gm.b.toArray());
    }

    public final void a(ParcelFileDescriptor parcelFileDescriptor) {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
        objectOutputStream.writeObject(this.a);
        objectOutputStream.writeObject(this.b);
    }
}
