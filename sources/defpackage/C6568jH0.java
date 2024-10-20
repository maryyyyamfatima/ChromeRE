package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.vision.face.internal.client.ContourParcel;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.FaceSettingsParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jH0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6568jH0 extends AbstractC1405Kv {
    public final FaceSettingsParcel h;

    public C6568jH0(Context context, FaceSettingsParcel faceSettingsParcel) {
        super(context, "FaceNativeHandle", "face");
        this.h = faceSettingsParcel;
        d();
    }

    public final MG0[] h(ByteBuffer byteBuffer, FrameMetadataParcel frameMetadataParcel) {
        if (!e()) {
            return new MG0[0];
        }
        try {
            ObjectWrapper objectWrapper = new ObjectWrapper(byteBuffer);
            C2226Rd1 c2226Rd1 = (C2226Rd1) ((InterfaceC2486Td1) d());
            Parcel a = c2226Rd1.a();
            AbstractC11786yV.c(a, objectWrapper);
            AbstractC11786yV.b(a, frameMetadataParcel);
            Parcel e = c2226Rd1.e(1, a);
            FaceParcel[] faceParcelArr = (FaceParcel[]) e.createTypedArray(FaceParcel.CREATOR);
            e.recycle();
            MG0[] mg0Arr = new MG0[faceParcelArr.length];
            for (int i = 0; i < faceParcelArr.length; i++) {
                mg0Arr[i] = g(faceParcelArr[i]);
            }
            return mg0Arr;
        } catch (RemoteException e2) {
            Log.e("FaceNativeHandle", "Could not call native face detector", e2);
            return new MG0[0];
        }
    }

    @Override // defpackage.AbstractC1405Kv
    public final Object a(C1146Iv0 c1146Iv0, Context context) {
        InterfaceC2876Wd1 c2616Ud1;
        IBinder h = c1146Iv0.h("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator");
        int i = AbstractBinderC2746Vd1.a;
        Object obj = null;
        if (h == null) {
            c2616Ud1 = null;
        } else {
            IInterface queryLocalInterface = h.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
            if (queryLocalInterface instanceof InterfaceC2876Wd1) {
                c2616Ud1 = (InterfaceC2876Wd1) queryLocalInterface;
            } else {
                c2616Ud1 = new C2616Ud1(h);
            }
        }
        if (c2616Ud1 != null) {
            ObjectWrapper objectWrapper = new ObjectWrapper(context);
            C2616Ud1 c2616Ud12 = (C2616Ud1) c2616Ud1;
            Parcel a = c2616Ud12.a();
            AbstractC11786yV.c(a, objectWrapper);
            AbstractC11786yV.b(a, this.h);
            Parcel e = c2616Ud12.e(1, a);
            IBinder readStrongBinder = e.readStrongBinder();
            int i2 = AbstractBinderC2356Sd1.a;
            if (readStrongBinder != null) {
                IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                if (queryLocalInterface2 instanceof InterfaceC2486Td1) {
                    obj = (InterfaceC2486Td1) queryLocalInterface2;
                } else {
                    obj = new C2226Rd1(readStrongBinder);
                }
            }
            e.recycle();
        }
        return obj;
    }

    @Override // defpackage.AbstractC1405Kv
    public final void c() {
        C2226Rd1 c2226Rd1 = (C2226Rd1) ((InterfaceC2486Td1) d());
        c2226Rd1.h(3, c2226Rd1.a());
    }

    public static MG0 g(FaceParcel faceParcel) {
        C6110hw1[] c6110hw1Arr;
        C12013z80[] c12013z80Arr;
        int i = faceParcel.g;
        PointF pointF = new PointF(faceParcel.h, faceParcel.i);
        float f = faceParcel.j;
        float f2 = faceParcel.k;
        LandmarkParcel[] landmarkParcelArr = faceParcel.o;
        if (landmarkParcelArr == null) {
            c6110hw1Arr = new C6110hw1[0];
        } else {
            C6110hw1[] c6110hw1Arr2 = new C6110hw1[landmarkParcelArr.length];
            for (int i2 = 0; i2 < landmarkParcelArr.length; i2++) {
                LandmarkParcel landmarkParcel = landmarkParcelArr[i2];
                c6110hw1Arr2[i2] = new C6110hw1(new PointF(landmarkParcel.g, landmarkParcel.h), landmarkParcel.i);
            }
            c6110hw1Arr = c6110hw1Arr2;
        }
        ContourParcel[] contourParcelArr = faceParcel.s;
        if (contourParcelArr == null) {
            c12013z80Arr = new C12013z80[0];
        } else {
            c12013z80Arr = new C12013z80[contourParcelArr.length];
            for (int i3 = 0; i3 < contourParcelArr.length; i3++) {
                PointF[] pointFArr = contourParcelArr[i3].a;
                c12013z80Arr[i3] = new C12013z80();
            }
        }
        return new MG0(i, pointF, f, f2, c6110hw1Arr, c12013z80Arr);
    }
}
