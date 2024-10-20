package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OW2 implements InterfaceC9989tE2 {
    public final InterfaceC9989tE2 a = LM3.a;

    @Override // defpackage.InterfaceC9989tE2
    public final Object get() {
        InterfaceC4919eV interfaceC4919eV = (InterfaceC4919eV) this.a.get();
        HashMap hashMap = new HashMap();
        EnumC7223lA2 enumC7223lA2 = EnumC7223lA2.DEFAULT;
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            throw new NullPointerException("Null flags");
        }
        byte b = (byte) (((byte) (0 | 1)) | 2);
        if (b != 3) {
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" delta");
            }
            if ((2 & b) == 0) {
                sb.append(" maxAllowedDelay");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
        }
        hashMap.put(enumC7223lA2, new C0590Eo(30000L, 86400000L, emptySet));
        EnumC7223lA2 enumC7223lA22 = EnumC7223lA2.HIGHEST;
        Set emptySet2 = Collections.emptySet();
        if (emptySet2 == null) {
            throw new NullPointerException("Null flags");
        }
        byte b2 = (byte) (((byte) (0 | 1)) | 2);
        if (b2 != 3) {
            StringBuilder sb2 = new StringBuilder();
            if ((b2 & 1) == 0) {
                sb2.append(" delta");
            }
            if ((2 & b2) == 0) {
                sb2.append(" maxAllowedDelay");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb2)));
        }
        hashMap.put(enumC7223lA22, new C0590Eo(1000L, 86400000L, emptySet2));
        EnumC7223lA2 enumC7223lA23 = EnumC7223lA2.VERY_LOW;
        if (Collections.emptySet() == null) {
            throw new NullPointerException("Null flags");
        }
        byte b3 = (byte) (((byte) (0 | 1)) | 2);
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(EnumC12137zW2.NETWORK_UNMETERED, EnumC12137zW2.DEVICE_IDLE)));
        if (unmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        if (b3 != 3) {
            StringBuilder sb3 = new StringBuilder();
            if ((b3 & 1) == 0) {
                sb3.append(" delta");
            }
            if ((2 & b3) == 0) {
                sb3.append(" maxAllowedDelay");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb3)));
        }
        hashMap.put(enumC7223lA23, new C0590Eo(86400000L, 86400000L, unmodifiableSet));
        if (interfaceC4919eV == null) {
            throw new NullPointerException("missing required property: clock");
        }
        if (hashMap.keySet().size() < EnumC7223lA2.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new C0460Do(interfaceC4919eV, hashMap);
    }
}
