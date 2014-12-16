/**
 *
 */
package net.oschina.j2cache.util;

import org.nustaq.serialization.FSTConfiguration;

import java.io.IOException;


/**
 * 使用 FST 实现序列化
 *
 * @author winterlau
 */
public class FSTSerializer implements Serializer {

    FSTConfiguration conf = FSTConfiguration.createDefaultConfiguration();

    @Override
    public String name() {
        return "fst";
    }

    @Override
    public byte[] serialize(Object obj) throws IOException {
        return conf.asByteArray(obj);
    }

    @Override
    public Object deserialize(byte[] bytes) throws IOException {
        if (bytes == null || bytes.length == 0)
            return null;
        return conf.asObject(bytes);
    }

}
