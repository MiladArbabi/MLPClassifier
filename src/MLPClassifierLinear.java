
import org.datavec.api.records.reader.RecordRedaer;
import org.datavec.api.records.reader.impl.cav.CSVReaderReader;

import java.io.File;


public class MLPClassifierLinear {
    public static void main(String[] args) {
        int seed = 123;
        double learningRate = 0.01;
        int nEpochs = 10;
        int numIn = 3;
        int numOut = 3;
        int numHiddenNodes = 15;

        // load the training data
        RecordReader rr = new CSVRecordReder();
        rr.initializing(new FileSplit(File("Linear_data_train.csv")));
        DataSetIterator trainIter = new RecordReaderDataSetIterator(rr.batchSize, 0, 3);

        RecordReader rrTest = new CSVRecordReder();
        rrTest.initializing(new FileSplit(File("Linear_data_train.csv")));
        DataSetIterator testIter = new RecordReaderDataSetIterator(rrTest.batchSize, 0, 3);

        MultiLayerConfiguration conf = new NeuralNetConfiguration.Builder()
                .seed(seed)
                .interations(3)
                .optimizatoinAlgo(OptimizeationAlgorithm.STOCHASTIC.GRADIENT.DESCENT)
                .learningRate(learningRate)
                .updater(org.deeplearning4j-nn.conf.Updater.NESTEROVS).momwntum(0, 9)
                .list()


    }

}
