package defpackage;

import J.N;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import org.chromium.content.browser.input.ImeAdapterImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ro0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerC9495ro0 extends Handler {
    public final /* synthetic */ BinderC9838so0 a;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        float[] floatArray;
        String str;
        BinderC9838so0 binderC9838so0 = this.a;
        C7744mi1 c7744mi1 = binderC9838so0.l;
        if (c7744mi1 == null) {
            return;
        }
        int i = message.what;
        ImeAdapterImpl imeAdapterImpl = c7744mi1.a;
        if (i == 101) {
            int length = binderC9838so0.i.length();
            if (imeAdapterImpl.f()) {
                N.MmtjCblb(imeAdapterImpl.a, imeAdapterImpl, 0, length);
            }
            binderC9838so0.l.a.o((CharSequence) message.obj, message.arg1, true, 0);
            C7744mi1 c7744mi12 = binderC9838so0.l;
            int i2 = message.arg1;
            ImeAdapterImpl imeAdapterImpl2 = c7744mi12.a;
            if (imeAdapterImpl2.f()) {
                N.MmtjCblb(imeAdapterImpl2.a, imeAdapterImpl2, i2, i2);
                return;
            }
            return;
        }
        if (i == 201) {
            imeAdapterImpl.i(message.arg1);
            return;
        }
        if (i != 401) {
            if (i != 301) {
                if (i != 302) {
                    return;
                }
                imeAdapterImpl.e();
                return;
            } else {
                imeAdapterImpl.E = true;
                imeAdapterImpl.s();
                imeAdapterImpl.E = false;
                return;
            }
        }
        if (((String) message.obj).equals("recognition_info")) {
            Bundle data = message.getData();
            if (binderC9838so0.l == null) {
                return;
            }
            String string = data.getString("gesture_type", "");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String string2 = data.getString("text_alternative", "");
            C11899yo3 c11899yo3 = new C11899yo3();
            if (string.equals("backspace") || string.equals("zigzag")) {
                floatArray = data.getFloatArray("start_point");
                float[] floatArray2 = data.getFloatArray("end_point");
                floatArray[0] = Math.max(floatArray[0], binderC9838so0.j.left);
                floatArray2[0] = Math.min(floatArray2[0], binderC9838so0.j.right);
                c11899yo3.d = BinderC9838so0.a(floatArray2);
                c11899yo3.b = 0;
            } else {
                if (string.equals("v_space")) {
                    floatArray = data.getFloatArray("lowest_point");
                    String string3 = data.getString("text_insertion", "");
                    str = TextUtils.isEmpty(string3) ? " " : string3;
                    int length2 = str.length();
                    short[] sArr = new short[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        sArr[i3] = (short) str.charAt(i3);
                    }
                    C8464on3 c8464on3 = new C8464on3();
                    c8464on3.b = sArr;
                    c11899yo3.f = c8464on3;
                    c11899yo3.b = 1;
                } else if (string.equals("wedge_space")) {
                    floatArray = data.getFloatArray("highest_point");
                    String string4 = data.getString("text_insertion", "");
                    str = TextUtils.isEmpty(string4) ? " " : string4;
                    int length3 = str.length();
                    short[] sArr2 = new short[length3];
                    for (int i4 = 0; i4 < length3; i4++) {
                        sArr2[i4] = (short) str.charAt(i4);
                    }
                    C8464on3 c8464on32 = new C8464on3();
                    c8464on32.b = sArr2;
                    c11899yo3.f = c8464on32;
                    c11899yo3.b = 1;
                } else {
                    if (!string.equals("u_type_remove_space") && !string.equals("arch_type_remove_space")) {
                        return;
                    }
                    floatArray = data.getFloatArray("start_point");
                    c11899yo3.d = BinderC9838so0.a(data.getFloatArray("end_point"));
                    c11899yo3.b = 2;
                }
            }
            c11899yo3.c = BinderC9838so0.a(floatArray);
            int length4 = string2.length();
            short[] sArr3 = new short[length4];
            for (int i5 = 0; i5 < length4; i5++) {
                sArr3[i5] = (short) string2.charAt(i5);
            }
            C8464on3 c8464on33 = new C8464on3();
            c8464on33.b = sArr3;
            c11899yo3.e = c8464on33;
            ImeAdapterImpl imeAdapterImpl3 = binderC9838so0.l.a;
            long j = imeAdapterImpl3.a;
            if (j == 0) {
                return;
            }
            int i6 = (int) imeAdapterImpl3.k.m.k;
            c11899yo3.c.c -= i6;
            C2192Qw2 c2192Qw2 = c11899yo3.d;
            if (c2192Qw2 != null) {
                c2192Qw2.c -= i6;
            }
            N.M3wL9MnJ(j, imeAdapterImpl3, c11899yo3.b());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC9495ro0(BinderC9838so0 binderC9838so0, Looper looper) {
        super(looper);
        this.a = binderC9838so0;
    }
}
