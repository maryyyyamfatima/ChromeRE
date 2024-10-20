package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: av, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3696av extends XF0 {
    public C3696av() {
        super(0);
    }

    @Override // defpackage.XF0
    public final OX0 b(MessageLite messageLite, int i) {
        String name = messageLite.getClass().getName();
        if (name.equals("com.google.apps.framework.data.proto.DataRequest") || name.equals("LV1") || name.equals("com.google.apps.framework.data.proto.MutateDataRequest") || name.equals("com.google.apps.framework.data.proto.DataResponse")) {
            return null;
        }
        name.equals("com.google.apps.framework.data.proto.MutateDataResponse");
        return null;
    }
}
