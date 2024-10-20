package defpackage;

import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lE2 */
/* loaded from: classes.dex */
public abstract class AbstractC7243lE2 {
    public static MessageLite a(ProtoParsers$InternalDontUse protoParsers$InternalDontUse, QX0 qx0, XF0 xf0) {
        QX0 qx02 = (QX0) qx0.l(PX0.GET_DEFAULT_INSTANCE);
        if (protoParsers$InternalDontUse.g == null) {
            JX0 jx0 = (JX0) qx02.l(PX0.NEW_BUILDER);
            jx0.m(qx02);
            byte[] bArr = protoParsers$InternalDontUse.a;
            jx0.n(bArr, bArr.length, xf0);
            protoParsers$InternalDontUse.g = jx0.j();
        }
        return protoParsers$InternalDontUse.g;
    }
}
